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
        queue: Queue[(String, String)],
        lengths: Map[String, Int] = Map.from(
          wordList
            .zip(List.fill(wordList.length)(Int.MaxValue))
            .appended(beginWord, Int.MaxValue)
        ),
        paths: Map[String, Set[String]] =
          Map.from(wordList.zip(List.fill(wordList.length)(Set.empty))),
        visited: HashSet[String] = HashSet.empty
    ): Map[String, Set[String]] = {
      if (queue.isEmpty) {
        paths
      } else {
        val ((prev, word), dequeued) = queue.dequeue

        val next = adjustmentHash(word)
        val newQueue =
          next.foldLeft(dequeued)((res, item) =>
            if (!visited.contains(item)) res.enqueue(word -> item) else res
          )
        val newLength = lengths.getOrElse(prev, 0) + 1
        val newLengths = lengths.updated(word, newLength.min(lengths(word)))
        val newRes: Map[String, Set[String]] =
          if (lengths(word) > newLength) paths.updated(word, Set(prev))
          else if (lengths(word) == newLength)
            paths.updated(word, paths(word) + prev)
          else paths
        bfs(
          newQueue,
          newLengths,
          newRes,
          visited + word
        )
      }
    }

    def backtracking(
        paths: Map[String, Set[String]]
    )(last: String): Set[List[String]] = {
      if (last == beginWord)
        Set(List(beginWord))
      else
        paths
          .getOrElse(last, Set.empty)
          .flatMap(backtracking(paths))
          .map(last :: _)
    }

    val x = bfs(Queue.empty.enqueue("" -> beginWord))
    val y = backtracking(x)(endWord).toList.map(_.reverse)
    y
  }
}
