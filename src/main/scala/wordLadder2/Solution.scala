package wordLadder2

import scala.annotation.tailrec
import scala.collection.immutable.{HashMap, HashSet, Queue}

object Solution {
  private def findAdjustments(
      wordList: List[String],
      word: String
  ): List[String] = {
    wordList.foldLeft(List.empty[String])((res, item) => {
      val diff = word
        .zip(item)
        .foldLeft(0)((diff, chars) =>
          chars match {
            case (c1, c2) if c1 != c2 => diff + 1
            case _                    => diff
          }
        )
      if (diff == 1) res.prepended(item) else res
    })
  }

  def findLadders(
      beginWord: String,
      endWord: String,
      wordList: List[String]
  ): List[List[String]] = {
    val adjustmentHash =
      wordList.foldLeft(
        HashMap.from(List(beginWord -> findAdjustments(wordList, beginWord)))
      )((h, word) => h.updated(word, findAdjustments(wordList, word)))

    @tailrec
    def bfs(
        queue: Queue[List[String]],
        visited: HashSet[String] = HashSet.empty
    ): Option[List[String]] = {
      if (queue.isEmpty) {
        None
      } else {
        val (path, dequeued) = queue.dequeue
        val lastWord = path.head

        if (lastWord == endWord)
          Some(path)
        else {
          val next = adjustmentHash(lastWord)
          val newQueue =
            next.foldLeft(dequeued)((res, item) =>
              if (!visited.contains(item)) res.enqueue(item +: path) else res
            )
          bfs(newQueue, visited + lastWord)
        }
      }
    }

    @tailrec
    def backtracking(
        queue: Queue[List[String]],
        res: List[List[String]],
        len: Int,
        visited: HashSet[String] = HashSet.empty
    ): List[List[String]] = {
      if (queue.isEmpty)
        res
      else {
        val (current, deq) = queue.dequeue
        if (current.head == endWord)
          backtracking(deq, current.reverse +: res, len)
        else if (current.length >= len)
          backtracking(deq, res, len)
        else {
          val newQ = adjustmentHash(current.head).foldLeft(deq)((d, item) =>
            if (!visited.contains(item)) d.enqueue(item +: current) else d
          )
          backtracking(newQ, res, len, visited + current.head)
        }
      }
    }

    val x = bfs(Queue.empty.enqueue(List(beginWord)))
    val y =
      x.fold(List.empty[List[String]])(shortest =>
        backtracking(
          Queue.empty.enqueue(List(beginWord)),
          List.empty[List[String]],
          shortest.length
        )
      )
    y
  }
}
