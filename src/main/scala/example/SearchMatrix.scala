package example

import scala.annotation.tailrec

object SearchMatrix {
  def main(args: Array[String]): Unit = {
    val x = Array(
      Array(1, 3)
    )

    print(searchMatrix(x, 3))
  }

  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    val m = matrix.length
    val n = matrix(0).length

    @tailrec
    def findRow(top: Int, bot: Int): Int = {
      val mid = top + (bot - top) / 2
      if (top > bot)
        -1
      else if (matrix(mid)(0) <= target && target <= matrix(mid)(n - 1))
        mid
      else if (matrix(mid)(0) > target)
        findRow(top, mid - 1)
      else
        findRow(mid + 1, bot)
    }

    @tailrec
    def find(ints: Array[Int], l: Int, r: Int): Boolean = {
      val mid = l + (r - l) / 2
      if (l > r)
        false
      else if (ints(mid) == target)
        true
      else if (ints(mid) > target)
        find(ints, l, mid - 1)
      else
        find(ints, mid + 1, r)
    }
    val x = findRow(0, m - 1)

    if (x != -1) find(matrix(x), 0, n - 1) else false
  }
}
