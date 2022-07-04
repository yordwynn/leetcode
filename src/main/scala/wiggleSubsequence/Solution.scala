package wiggleSubsequence

import scala.annotation.tailrec

object Solution {
  def wiggleMaxLength(nums: Array[Int]): Int = {
    @tailrec
    def go(up: Int, down: Int, i: Int): Int = {
      if (i < nums.length)
        if (nums(i) > nums(i - 1))
          go(down + 1, down, i + 1)
        else if (nums(i) < nums(i - 1))
          go(up, up + 1, i + 1)
        else
          go(up, down, i + 1)
      else up.max(down)
    }
    go(1, 1, 1)
  }
}
