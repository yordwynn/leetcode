package orderlyQueue

import scala.annotation.tailrec

// 899. Orderly Queue
object Solution {
  def orderlyQueue(s: String, k: Int): String = {
    @tailrec
    def oneKik(current: String, i: Int, res: String): String = {
      if (i > s.length)
        res
      else {
        val newRes = current.tail :+ current.head
        if (newRes < res) oneKik(newRes, i + 1, newRes)
        else oneKik(newRes, i + 1, res)
      }
    }

    if (k == 1)
      oneKik(s, 0, s)
    else
      s.sorted
  }
}
