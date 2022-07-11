package jumpGame6

import scala.collection.mutable

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

  def maxResult(nums: Array[Int], k: Int): Int = {
    val dp = mutable.PriorityQueue.empty[(Int, Int)]
    dp.addOne(nums(0) -> 0)

    for (i <- 0 to nums.length) {
      dp.dequeue() match {
        case (x, y) if y >= i =>
          for (j <- 1 to k) {
            if (y + j < nums.length)
              dp.enqueue((nums(y + j) + x, y + j))
          }
      }
    }

    ???
  }
}
