package pascalTriangle

import scala.annotation.tailrec

object Solution {
  def generate(numRows: Int): List[List[Int]] = {
    @tailrec
    def go(i: Int, n: Int, res: List[List[Int]] = Nil): List[List[Int]] = {
      i match {
        case _ if i == n => res.reverse
        case 0           => go(i + 1, n, List(1) +: res)
        case 1           => go(i + 1, n, List(1, 1) +: res)
        case _ =>
          val row = res.head.foldRight((List.empty[Int], 0))((item, acc) =>
            acc match {
              case (lst, pred) => ((item + pred) +: lst, item)
            }
          )
          val newRes = (1 +: row._1) +: res
          go(i + 1, n, newRes)
      }
    }

    go(0, numRows)
  }
}
