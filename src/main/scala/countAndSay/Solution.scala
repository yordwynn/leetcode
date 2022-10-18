package countAndSay

import scala.annotation.tailrec

// 38. Count and Say
object Solution {
  def countAndSay(n: Int): String = {
    def count(s: String): List[(Char, Int)] = {
      val (res, lastCnt) =
        s.tail.foldLeft((List.empty[(Char, Int)], (s(0), 1)))((res, letter) => {
          res match {
            case (acc, cnt) =>
              if (cnt._1 == letter)
                (acc, (cnt._1, cnt._2 + 1))
              else
                (cnt +: acc, (letter, 1))
          }
        })
      lastCnt +: res
    }

    def say(counts: List[(Char, Int)]): String = {
      counts.reverseIterator.map { case (letter, count) =>
        s"$count$letter"
      }.mkString
    }

    @tailrec
    def go(x: Int, res: String): String = {
      x match {
        case 1 => res
        case _ =>
          val cnt = count(res)
          go(x - 1, say(cnt))
      }
    }

    go(n, "1")
  }
}
