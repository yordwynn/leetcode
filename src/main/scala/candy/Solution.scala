package candy

import scala.annotation.tailrec

object Solution {
  def candy(ratings: Array[Int]): Int = {
    val cnds = Array.fill(ratings.length)(1)

    @tailrec
    def l2r(i: Int): Array[Int] = {
      if (i >= cnds.length)
        cnds
      else if (ratings(i) > ratings(i - 1)) {
        cnds(i) = cnds(i - 1) + 1
        l2r(i + 1)
      } else
        l2r(i + 1)
    }

    @tailrec
    def r2l(i: Int): Array[Int] = {
      if (i < 0)
        cnds
      else if (ratings(i) > ratings(i + 1)) {
        cnds(i) = (cnds(i + 1) + 1).max(cnds(i))
        r2l(i - 1)
      } else
        r2l(i - 1)
    }

    val _ = l2r(1)
    val r = r2l(ratings.length - 2)

    r.sum
  }
}
