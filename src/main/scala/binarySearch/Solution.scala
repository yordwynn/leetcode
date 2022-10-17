package binarySearch

import scala.annotation.tailrec

// 704. Binary Search
object Solution {
  def search(nums: Array[Int], target: Int): Int = {
    @tailrec
    def go(l: Int, r: Int): Int = {
      if (l > r)
        -1
      else {
        val m = (l + r) / 2
        if (nums(m) == target)
          m
        else if (nums(m) < target)
          go(m + 1, r)
        else
          go(l, m - 1)
      }
    }

    go(0, nums.length - 1)
  }
}
