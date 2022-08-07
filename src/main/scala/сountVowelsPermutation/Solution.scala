package сountVowelsPermutation

import scala.annotation.tailrec

// 1220. Count Vowels Permutation
object Solution {
  def countVowelPermutation(n: Int): Int = {
    val mod = 1000000007

    val dp = Array.fill(n, 5)(0)
    fillFirst(0)

    @tailrec
    def fillFirst(i: Int): Unit =
      if (i >= 5) ()
      else {
        dp(0)(i) = 1
        fillFirst(i + 1)
      }

    @tailrec
    def go(i: Int): Unit = {
      if (i >= n)
        ()
      else {
        dp(i)(0) = ((dp(i - 1)(1) + dp(i - 1)(2)) % mod + dp(i - 1)(4)) % mod
        dp(i)(1) = (dp(i - 1)(0) + dp(i - 1)(2)) % mod
        dp(i)(2) = (dp(i - 1)(1) + dp(i - 1)(3)) % mod
        dp(i)(3) = dp(i - 1)(2)
        dp(i)(4) = (dp(i - 1)(2) + dp(i - 1)(3)) % mod
        go(i + 1)
      }
    }

    go(1)
    (dp(n - 1).map(_.toLong).sum % mod).toInt
  }
}
