package findFirstAndLastPositionOfElementInSortedArray

import scala.annotation.tailrec

// 34. Find First and Last Position of Element in Sorted Array
object Solution {
  def searchRange(nums: Array[Int], target: Int): Array[Int] = {
    @tailrec
    def findEdge(left: Int, right: Int)(
        p: Int => Boolean,
        leftBorder: (Int, Int, Int) => Int,
        rightBorder: (Int, Int, Int) => Int
    ): Int = {
      val mid = (left + right) / 2
      if (left > right)
        -1
      else if (nums(mid) > target)
        findEdge(left, mid - 1)(p, leftBorder, rightBorder)
      else if (nums(mid) < target)
        findEdge(mid + 1, right)(p, leftBorder, rightBorder)
      else if (p(mid))
        findEdge(leftBorder(left, right, mid), rightBorder(left, right, mid))(
          p,
          leftBorder,
          rightBorder
        )
      else mid
    }

    val lp = (m: Int) => m - 1 >= 0 && nums(m - 1) >= target
    val leftLeft = (l: Int, _: Int, _: Int) => l
    val leftRight = (_: Int, _: Int, m: Int) => m - 1
    val left = findEdge(0, nums.length - 1)(lp, leftLeft, leftRight)

    val rp = (m: Int) => m + 1 < nums.length && nums(m + 1) <= target
    val rightLeft = (_: Int, _: Int, m: Int) => m + 1
    val rightRight = (_: Int, r: Int, _: Int) => r
    val right = findEdge(0, nums.length - 1)(rp, rightLeft, rightRight)

    Array(left, right)
  }
}
