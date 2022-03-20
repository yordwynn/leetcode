package example

object Domino {
  def main(args: Array[String]): Unit = {
    val tops = Array(3, 5, 1, 2, 3)
    val bottoms = Array(3, 6, 3, 3, 4)

    println(minDominoRotations(tops, bottoms))
  }

  def minDominoRotations(tops: Array[Int], bottoms: Array[Int]): Int = {
    val topCount = Array.fill(7)(0)
    val botCount = Array.fill(7)(0)
    val equalCount = Array.fill(7)(0)

    for (i <- tops.indices) {
      if (tops(i) != bottoms(i)) {
        topCount(tops(i)) = topCount(tops(i)) + 1
        botCount(bottoms(i)) = botCount(bottoms(i)) + 1
      } else {
        equalCount(tops(i)) = equalCount(tops(i)) + 1
      }
    }

    var res = -1

    for (i <- topCount.indices) {
      val t = topCount(i)
      val b = botCount(i)
      val e = equalCount(i)

      if (t + b + e == tops.length)
        res = Math.min(t, b)
    }

    res
  }
}
