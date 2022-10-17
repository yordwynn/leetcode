package findTheDuplicateNumber

import scala.annotation.tailrec

// 287. Find the Duplicate Number
object Solution {
  def findDuplicate(nums: Array[Int]): Int = {
    @tailrec
    def go(l: Int, r: Int): Int = {
      val m = l + (r - l) / 2
      if (l < r) {
        val lessThanM = lessThan(m)
        if (lessThanM > m)
          go(l, m)
        else
          go(m + 1, r)
      } else
        m
    }

    def lessThan(n: Int): Int = {
      nums.count(_ <= n)
    }

    go(0, nums.length - 1)
  }
}
