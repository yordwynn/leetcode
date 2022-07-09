package jumpGame6

object Solution {
  def maxResultSlow(nums: Array[Int], k: Int): Int = {
    val dp = Array.fill(nums.length)(Int.MinValue)
    dp(0) = nums(0)

    for (i <- 0 to nums.length) {
      for (j <- 1 to k) {
        if (i + j < nums.length) {
          val x = dp(i) + nums(i + j)
          dp(i + j) = x.max(dp(i + j))
        } else ()
      }
    }

    dp(nums.length - 1)
  }
}
