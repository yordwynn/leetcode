package rangeSumQueryMutable

import scala.annotation.tailrec

class NumArray(_nums: Array[Int]) {
  def update(index: Int, `val`: Int): Unit = {
    _nums(index) = `val`
  }

  def sumRange(left: Int, right: Int): Int = {
    @tailrec
    def go(i: Int = left, res: Int = 0): Int =
      if (i > right) res else go(i + 1, res + _nums(i))

    go()
  }
}
