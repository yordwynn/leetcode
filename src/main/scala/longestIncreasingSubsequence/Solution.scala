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


trait Mon[F[_]] {
  def map[A, B](fa: F[A])(f: A => B): F[B]
  def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B]
  def map2[A, B, C](fa: F[A], fb: F[B])(f: (A,B) => C): F[C] = flatMap[A, C](fa)(a => map[B, C](fb)(b => f(a, b)))
}
