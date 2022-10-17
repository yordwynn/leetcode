package theKWeakestRowsInAMatrix

import scala.annotation.tailrec

// 1337. The K Weakest Rows in a Matrix
object Solution {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    mat
      .map(findLastOne)
      .zipWithIndex
      .foldLeft(Map.empty[Int, Seq[Int]])((m, item) =>
        item match {
          case (v, index) =>
            val x = m.getOrElse(v, Seq.empty)
            m + ((v, x.appended(index)))
        }
      )
      .toArray
      .sortBy { case (i, _) => i }
      .take(k)
      .flatMap(_._2)
      .take(k)
  }

  private def findLastOne(row: Array[Int]): Int = {
    @tailrec
    def go(l: Int, r: Int): Int = {
      if (l - r == 1)
        l
      else {
        val m = l + (r - l) / 2
        if (row(m) == 1)
          go(m + 1, r)
        else
          go(l, r - 1)
      }
    }

    go(0, row.length - 1)
  }
}
