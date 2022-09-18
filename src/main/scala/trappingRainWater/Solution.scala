package trappingRainWater

import scala.annotation.tailrec

// 42. Trapping Rain Water
object Solution {
  def trap(height: Array[Int]): Int = {
    @tailrec
    def trapWater(i: Int, lefts: List[Int], res: Int): (Int, List[Int]) = {
      if (lefts.isEmpty)
        (res, lefts)
      else if (lefts.tail.isEmpty && height(i) > height(lefts.head))
        (res, i +: lefts.tail)
      else if (height(lefts.head) < height(i) && lefts.tail.nonEmpty) {
        val top = lefts.head
        val predTop = lefts.tail.head
        val width = i - predTop - 1
        val hei = math.min(height(predTop), height(i)) - height(top)
        trapWater(i, lefts.tail, res + width * hei)
      } else
        (res, i +: lefts)
    }

    @tailrec
    def go(i: Int, bars: List[Int], res: Int): Int = {
      if (i >= height.length)
        res
      else {
        if (bars.isEmpty || height(bars.head) >= height(i))
          go(i + 1, i +: bars, res)
        else {
          val (updRes, updLefts) = trapWater(i, bars, res)
          go(i + 1, updLefts, updRes)
        }
      }
    }

    go(0, List.empty, 0)
  }
}
