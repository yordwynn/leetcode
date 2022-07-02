package MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts

import scala.annotation.tailrec

object Solution {
  def maxCut(cuts: Array[Int], border: Int): Long = {
    @tailrec
    def go(x: Int, max: Long): Long = {
      if (x == cuts.length)
        if (border - cuts(x - 1) > max) border - cuts(x - 1) else max
      else if (cuts(x) - cuts(x - 1) > max)
        go(x + 1, cuts(x) - cuts(x - 1))
      else go(x + 1, max)
    }

    go(1, cuts(0))
  }

  def maxArea(
      h: Int,
      w: Int,
      horizontalCuts: Array[Int],
      verticalCuts: Array[Int]
  ): Int = {
    val sortedHor = horizontalCuts.sorted
    val sortedVert = verticalCuts.sorted
    val maxH = maxCut(sortedHor, h)
    val maxV = maxCut(sortedVert, w)

    ((maxH * maxV) % 1000000007L).toInt
  }
}
