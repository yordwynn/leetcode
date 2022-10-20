package integerToRoman

import scala.annotation.tailrec

// 12. Integer to Roman
object Solution {
  val intToRomanMap = Map(
    1000 -> "M",
    900 -> "CM",
    500 -> "D",
    400 -> "CD",
    100 -> "C",
    90 -> "XC",
    50 -> "L",
    40 -> "XL",
    10 -> "X",
    9 -> "IX",
    5 -> "V",
    4 -> "IV",
    1 -> "I"
  )
  val ints: Iterable[Int] =
    intToRomanMap.keys.toList.sorted(Ordering.Int.reverse)
  def intToRoman(num: Int): String = {
    @tailrec
    def go(n: Int, res: String): String = {
      val maybeDigit = ints.find(_ <= n)
      maybeDigit match {
        case Some(value) => go(n - value, res ++ intToRomanMap(value))
        case None        => res
      }
    }

    go(num, "")
  }
}
