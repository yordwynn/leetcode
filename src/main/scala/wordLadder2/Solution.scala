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

    def backtracking(
        len: Int,
        res: List[String],
        visited: HashSet[String] = HashSet.empty
    ): List[List[String]] = {
      adjustmentHash(res.head).flatMap(word => {
        if (res.length + 1 > len || visited.contains(word))
          List.empty
        else if (word == endWord)
          List((word +: res).reverse)
        else
          backtracking(len, word +: res, visited + word)
      })
    }

    val x = bfs(Queue.empty.enqueue(List(beginWord)))
    val y =
      x.fold(List.empty[List[String]])(shortest =>
        backtracking(shortest.length, List(beginWord))
      )
    y
  }
}
