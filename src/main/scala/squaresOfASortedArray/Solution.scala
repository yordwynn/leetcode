package squaresOfASortedArray

import scala.annotation.tailrec

// 977. Squares of a Sorted Array
object Solution {
  def sortedSquares(nums: Array[Int]): Array[Int] = {
    @tailrec
    def go(res: Array[Int], i: Int, left: Int, right: Int): Array[Int] =
      if (i < 0)
        res
      else {
        val leftVal = nums(left).abs
        val rightVal = nums(right).abs

        if (leftVal >= rightVal) {
          res.update(i, leftVal * leftVal)
          go(res, i - 1, left + 1, right)
        } else {
          res.update(i, rightVal * rightVal)
          go(res, i - 1, left, right - 1)
        }
      }

    val n = nums.length
    val result = Array.fill(n)(0)
    go(result, n - 1, 0, n - 1)
  }
}
