package longestIncreasingSubsequence

import scala.annotation.tailrec

// 300. Longest Increasing Subsequence
object Solution {
  def lengthOfLIS(nums: Array[Int]): Int = {
    val dp = Array.fill(nums.length)(1)

    @tailrec
    def go(i: Int = 1, res: Int = 1): Int = {
      if (i >= nums.length)
        res
      else {
        for (j <- 0 until i) {
          if (nums(i) > nums(j)) dp(i) = dp(i).max(dp(j) + 1)
        }
        go(i + 1, res.max(dp(i)))
      }
    }

    go()
  }
}
