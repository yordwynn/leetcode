package example

import scala.annotation.tailrec

object BinarySearch {
  def main(args: Array[String]): Unit = {
    val x = Array(
      Array(1, 1, 0, 0, 0),
      Array(1, 1, 1, 1, 0),
      Array(1, 0, 0, 0, 0),
      Array(1, 1, 0, 0, 0),
      Array(1, 1, 1, 1, 1)
    )

    println(kWeakestRows(x, 3).mkString(", "))
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

  def findLastOne(row: Array[Int]): Int = {
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
