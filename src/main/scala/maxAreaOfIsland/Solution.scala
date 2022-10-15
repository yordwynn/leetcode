package maxAreaOfIsland

import scala.annotation.tailrec
import scala.collection.mutable

// 695. Max Area of Island
object Solution {
  def maxAreaOfIsland(grid: Array[Array[Int]]): Int = {
    val visited = mutable.HashSet[(Int, Int)]()

    def dfs(i: Int, j: Int): Int =
      if (
        i >= grid.length || i < 0 || j >= grid(0).length || j < 0 || grid(i)(
          j
        ) == 0 || visited.contains(i -> j)
      )
        0
      else {
        visited.add(i -> j)
        1 + dfs(i + 1, j) + dfs(i, j + 1) + dfs(i - 1, j) + dfs(i, j - 1)
      }

    @tailrec
    def go(i: Int, j: Int, res: Int): Int = {
      if (j >= grid(0).length)
        go(i + 1, 0, res)
      else if (i >= grid.length)
        res
      else if (grid(i)(j) == 0)
        go(i, j + 1, res)
      else {
        val size = dfs(i, j)
        go(i, j + 1, res.max(size))
      }
    }

    go(0, 0, 0)
  }
}
