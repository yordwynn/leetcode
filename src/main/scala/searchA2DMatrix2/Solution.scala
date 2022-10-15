package searchA2DMatrix2

import scala.annotation.tailrec

// 240. Search a 2D Matrix II
object Solution {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    @tailrec
    def go(i: Int, j: Int): Boolean = {
      if (i < 0 || j >= matrix(0).length)
        false
      else if (matrix(i)(j) == target)
        true
      else if (matrix(i)(j) > target)
        go(i - 1, j)
      else
        go(i, j + 1)
    }

    go(matrix.length - 1, 0)
  }
}
