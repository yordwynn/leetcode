package longestIncreasingSubsequence

import scala.annotation.tailrec

// 300. Longest Increasing Subsequence
object Solution {
  def lengthOfLIS(nums: Array[Int]): Int = {
    val dp = Array.fill(nums.length)(1)

    @tailrec
    def go(i: Int = 1): Unit = {
      if (i < nums.length) {
        for (j <- 0 until i) {
          if (nums(i) > nums(j)) dp(i) = dp(i).max(dp(j) + 1)
        }
        go(i + 1)
      }
    }

    go()
    dp.max
  }
}
