package outOfBoundaryPaths

import scala.annotation.tailrec

// 576. Out of Boundary Paths
object Solution {
  def findPaths(
      m: Int,
      n: Int,
      maxMove: Int,
      startRow: Int,
      startColumn: Int
  ): Int = {
    val mod = 1000000007
    @tailrec
    def go(
        i: Int,
        j: Int,
        cur: Array[Array[Int]],
        pred: Array[Array[Int]],
        res: Int
    ): Int = {
      if (i == m)
        res
      else if (j == n)
        go(i + 1, 0, cur, pred, res)
      else {
        cur(i)(j) = (
          ((if (i > 0) pred(i - 1)(j) else 0) + (if (i < m - 1) pred(i + 1)(j)
                                                 else 0)) % mod +
            ((if (j > 0) pred(i)(j - 1) else 0) + (if (j < n - 1) pred(i)(j + 1)
                                                   else 0)) % mod
        ) % mod
        var r = res
        r = if (i == 0) (r + pred(i)(j)) % mod else r
        r = if (j == 0) (r + pred(i)(j)) % mod else r
        r = if (i == m - 1) (r + pred(i)(j)) % mod else r
        r = if (j == n - 1) (r + pred(i)(j)) % mod else r
        go(i, j + 1, cur, pred, r)
      }
    }

    val dp0 = Array.fill(m)(Array.fill(n)(0))
    val dp1 = Array.fill(m)(Array.fill(n)(0))
    dp0(startRow)(startColumn) = 1
    val dynamics = Array(dp0, dp1)
    var res = 0
    for (k <- 1 to maxMove) {
      res = go(0, 0, dynamics(k % 2), dynamics((k + 1) % 2), res)
    }
    res
  }
}
