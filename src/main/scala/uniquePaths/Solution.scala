package uniquePaths

import scala.annotation.tailrec

// 62. Unique Paths
object Solution {
  def uniquePaths(m: Int, n: Int): Int = {
    @tailrec
    def go(i: Int, j: Int, buf: Array[Array[Int]]): Int = (i, j) match {
      case (x, _) if x == m =>
        buf(m - 1)(n - 1)
      case (_, y) if y == n => go(i + 1, 0, buf)
      case (x, y) if x == 0 || y == 0 =>
        buf(i)(j) = 1
        go(i, j + 1, buf)
      case (x, y) =>
        buf(x)(y) = buf(x - 1)(y) + buf(x)(y - 1)
        go(i, j + 1, buf)
    }

    val d = Array.fill(m, n)(0)
    go(0, 0, d)
  }
}
