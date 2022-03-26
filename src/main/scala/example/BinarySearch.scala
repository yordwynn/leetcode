package example

import scala.annotation.tailrec

object BinarySearch {
  def main(args: Array[String]): Unit = {
    val x = Array(-1, 0, 3, 5, 9, 12)
    println(search(x, 9))
  }

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
