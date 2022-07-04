package candy

import scala.annotation.tailrec

object Solution {
  def candy(ratings: Array[Int]): Int = {
    val left2right = Array.fill(ratings.length)(1)
    val right2left = Array.fill(ratings.length)(1)

    @tailrec
    def l2r(i: Int): Array[Int] = {
      if (i >= left2right.length)
        left2right
      else if (ratings(i) > ratings(i - 1)) {
        left2right(i) = left2right(i - 1) + 1
        l2r(i + 1)
      } else
        l2r(i + 1)
    }

    @tailrec
    def r2l(i: Int): Array[Int] = {
      if (i < 0)
        right2left
      else if (ratings(i) > ratings(i + 1)) {
        right2left(i) = right2left(i + 1) + 1
        r2l(i - 1)
      } else
        r2l(i - 1)
    }

    val l = l2r(1)
    val r = r2l(ratings.length - 2)

    l.zip(r)
      .foldLeft(0)((res, item) =>
        item match {
          case (x, y) if x >= y => res + x
          case (x, y) if y > x  => res + y
        }
      )
  }
}
