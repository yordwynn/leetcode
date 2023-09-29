package wordLadder

import scala.annotation.tailrec

// 127. Word Ladder
object Solution {
  def ladderLength(
      beginWord: String,
      endWord: String,
      wordList: List[String]
  ): Int = {
    def keys(s: String): Vector[String] =
      Vector.tabulate(s.length)(s.updated(_, '_'))

    val wordKeys = for {
      w <- wordList.toVector
      k <- keys(w)
    } yield k -> w
    val words = wordKeys.groupMap(_._1)(_._2)

    @tailrec
    def go(
        currentWords: Vector[String],
        visited: Vector[String],
        res: Int
    ): Int = {
      if (currentWords.contains(endWord))
        res
      else if (currentWords.isEmpty)
        0
      else {
        val nextStep = for {
          word <- currentWords
          key <- keys(word)
          next <- words.getOrElse(key, Vector.empty) if !visited.contains(next)
        } yield next

        val newVisited = (visited ++ nextStep).distinct

        go(nextStep, newVisited, res + 1)
      }
    }

    go(Vector(beginWord), Vector.empty, 1)
  }
}
