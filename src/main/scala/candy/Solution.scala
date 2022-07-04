package candy

import scala.annotation.tailrec

object Solution {
  def candy(ratings: Array[Int]): Int = {
    val cnds = Array.fill(ratings.length)(1)

    @tailrec
    def go(i: Int = 1): Array[Int] = {
      if (i >= cnds.length)
        cnds
      else if (ratings(i) > ratings(i - 1)) {
        cnds(i) = cnds(i - 1) + 1
        go(i + 1)
      } else if (ratings(i) < ratings(i - 1) && cnds(i) >= cnds(i - 1)) {
        giveExtra(i - 1)
        go(i + 1)
      } else
        go(i + 1)
    }

    @tailrec
    def giveExtra(i: Int): Array[Int] = {
      cnds(i) = cnds(i) + 1
      if (i == 0)
        cnds
      else if (cnds(i) >= cnds(i - 1) && ratings(i) < ratings(i - 1))
        giveExtra(i - 1)
      else
        cnds
    }

    go()
    cnds.sum
  }
}
