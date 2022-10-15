package numberOfMatchingSubsequences

import scala.collection.immutable.HashMap

// 792. Number of Matching Subsequences
object Solution {
  def numMatchingSubseq(s: String, words: Array[String]): Int = {
    val substrings =
      words.foldLeft(HashMap.empty[Char, Seq[String]])((map, word) => {
        val words = map.getOrElse(word.head, Seq.empty)
        map.updated(word.head, word +: words)
      })

    s.foldLeft((substrings, 0))((res, letter) => {
      val words = res._1
      val count = res._2
      val maybeStartsFrom = words.get(letter)
      maybeStartsFrom.fold(res)(startsFrom =>
        startsFrom.foldLeft((words.removed(letter), count))((nRes, wrd) => {
          if (wrd.length == 1)
            (nRes._1, nRes._2 + 1)
          else {
            val firstLetter = wrd.charAt(1)
            val newWords = nRes._1.updated(
              firstLetter,
              nRes._1
                .getOrElse(firstLetter, Seq.empty)
                .prepended(wrd.substring(1))
            )
            (newWords, nRes._2)
          }
        })
      )
    })._2
  }
}
