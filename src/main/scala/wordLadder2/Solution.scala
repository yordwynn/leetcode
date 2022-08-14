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
    def go(
        queue: Queue[List[String]],
        visited: HashSet[String] = HashSet.empty,
        res: List[List[String]] = Nil,
        minLength: Int = Int.MaxValue
    ): List[List[String]] = {
      if (queue.isEmpty || queue.head.length > minLength) {
        res
      } else {
        val (path, dequeued) = queue.dequeue
        val lastWord = path.head

        if (lastWord == endWord)
          go(dequeued, visited, path +: res, path.length)
        else {
          val next = adjustmentHash(lastWord)
          val newQueue =
            next.foldLeft(dequeued)((res, item) =>
              if (visited.contains(item)) res else res.enqueue(item +: path)
            )
          go(newQueue, visited + lastWord, res, minLength)
        }
      }
    }

    go(Queue.empty.enqueue(List(beginWord))).map(_.reverse)
  }
}
