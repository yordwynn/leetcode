package minCostClimbingStairs

object Solution {
  def minCostClimbingStairs(cost: Array[Int]): Int = {
    val dp = Array.fill(cost.length)(Int.MaxValue)
    dp(0) = cost(0)
    dp(1) = cost(1)

    for (i <- 0 to dp.length) {
      for (j <- 1 to 2) {
        if (i + j < dp.length) {
          val x = dp(i) + cost(i + j)
          if (dp(i + j) > x)
            dp(i + j) = x
        }
      }
    }

    dp(dp.length - 1).min(dp(dp.length - 2))
  }
}
