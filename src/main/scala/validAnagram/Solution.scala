package validAnagram

import scala.collection.immutable.HashMap

// 242. Valid Anagram
object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    def count(word: String): Map[Char, Int] =
      word.foldLeft(HashMap.empty[Char, Int])((map, letter) => {
        val cnt = map.getOrElse(letter, 0)
        map.updated(letter, cnt + 1)
      })

    val lettersS = count(s)
    val lettersT = count(t)

    lettersS == lettersT
  }
}
