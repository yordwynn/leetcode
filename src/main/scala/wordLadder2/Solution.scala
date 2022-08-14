package wordLadder2

import scala.annotation.tailrec
import scala.collection.immutable.{HashMap, Queue}

object Solution {
  def findLadders(
      beginWord: String,
      endWord: String,
      wordList: List[String]
  ): List[List[String]] = {
    @tailrec
    def go(
        queue: Queue[List[String]],
        adjustments: HashMap[String, List[String]] = HashMap.empty,
        res: List[List[String]] = Nil,
        minLength: Int = Int.MaxValue
    ): List[List[String]] = {
      if (queue.isEmpty) {
        res
      } else {
        val (path, dequeued) = queue.dequeue
        if (path.length <= minLength) {
          val lastWord = path.head
          if (lastWord == endWord)
            go(dequeued, adjustments, path +: res, path.length)
          else {
            val next =
              adjustments.getOrElse(lastWord, findAdjustments(lastWord))
            val newQueue =
              next.foldLeft(dequeued)((res, item) => res.enqueue(item +: path))
            if (adjustments.contains(lastWord))
              go(newQueue, adjustments, res, minLength)
            else
              go(newQueue, adjustments.updated(lastWord, next), res, minLength)
          }
        } else {
          res
        }
      }
    }

    def findAdjustments(word: String): List[String] = {
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

    if (wordList.contains(endWord) && findAdjustments(endWord).nonEmpty)
      go(Queue.empty.enqueue(List(beginWord))).map(_.reverse)
    else
      List.empty
  }
}
