package romanToInteger

import scala.annotation.tailrec

// 13. Roman to Integer
object Solution {
  private val romans = Map.from(
    Seq(
      'I' -> 1,
      'V' -> 5,
      'X' -> 10,
      'L' -> 50,
      'C' -> 100,
      'D' -> 500,
      'M' -> 1000
    )
  )
  def romanToInt(s: String): Int = {
    @tailrec
    def go(i: Int, res: Int): Int = {
      if (i < 0)
        res
      else {
        val current = romans(s(i))
        val next = romans(s(i + 1))
        if (current < next)
          go(i - 1, res - current)
        else
          go(i - 1, res + current)
      }
    }
    go(s.length - 2, romans(s.last))
  }
}
