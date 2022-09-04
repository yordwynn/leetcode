package numbersWithSameConsecutiveDifferences

import scala.collection.mutable

// 967. Numbers With Same Consecutive Differences
object Solution {
  def numsSameConsecDiff(n: Int, k: Int): Array[Int] = {
    val ab = mutable.Buffer.empty[Int]
    val maxM = math.pow(10, n - 1).toInt

    def go(lastDigit: Int, number: Int, m: Int): Unit = {
      val newNumber = number + lastDigit * m

      if (m == maxM) {
        if (newNumber >= maxM) ab.append(newNumber) else ()
      } else {
        if (lastDigit - k >= 0) go(lastDigit - k, newNumber, m * 10)
        if (lastDigit + k <= 9 && k != 0) go(lastDigit + k, newNumber, m * 10)
      }
    }

    for (i <- 0 to 9) go(i, 0, 1)
    ab.toArray
  }
}
