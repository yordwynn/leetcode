package nearestExitFromEntranceInMaze

import scala.annotation.tailrec
import scala.collection.mutable

// 1926. Nearest Exit from Entrance in Maze
object Solution {
  def nearestExit(maze: Array[Array[Char]], entrance: Array[Int]): Int = {
    val n = maze.length
    val m = maze(0).length
    val visited: Array[Array[Int]] =
      Array.fill(maze.length, maze(0).length)(-1)
    visited(entrance(0))(entrance(1)) = 0

    val queue: mutable.Queue[(Int, Int)] = mutable.Queue.empty

    def isExit(point: (Int, Int)): Boolean =
      point._1 == 0 || point._2 == 0 || point._1 == n - 1 || point._2 == m - 1

    def canStep(point: (Int, Int)): Boolean =
      point._1 >= 0 && point._1 < n && point._2 >= 0 && point._2 < m && maze(
        point._1
      )(point._2) == '.' && visited(point._1)(point._2) == -1

    def addSteps(p: (Int, Int), len: Int): Unit = {
      addStep((p._1 - 1, p._2), len + 1)
      addStep((p._1 + 1, p._2), len + 1)
      addStep((p._1, p._2 - 1), len + 1)
      addStep((p._1, p._2 + 1), len + 1)
    }

    def addStep(p: (Int, Int), length: Int): Unit =
      if (canStep(p)) {
        queue.enqueue(p)
        visited(p._1)(p._2) = length
      }

    @tailrec
    def go: Int = {
      if (queue.isEmpty)
        -1
      else {
        val point = queue.dequeue()
        val len = visited(point._1)(point._2)
        if (isExit(point))
          visited(point._1)(point._2)
        else {
          addSteps(point, len)
          go
        }
      }
    }

    addSteps(entrance(0) -> entrance(1), 0)
    go
  }
}
