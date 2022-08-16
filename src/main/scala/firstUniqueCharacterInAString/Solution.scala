package firstUniqueCharacterInAString

import scala.annotation.tailrec

object Solution {
  def firstUniqChar(s: String): Int = {
    val counts = s.foldLeft(Map.empty[Char, Int])((acc, item) => {
      val cnt = acc.getOrElse(item, 0)
      acc.updated(item, cnt + 1)
    })

    @tailrec
    def go(i: Int): Int =
      if (i >= s.length) -1 else if (counts(s(i)) == 1) i else go(i + 1)

    go(0)
  }
}
