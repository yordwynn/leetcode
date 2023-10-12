package intergerBreak

object Solution {
  // 343. Integer Break
  def integerBreak(n: Int): Int = {
    def fillItem(nums: Array[Int], startMax: Int, i: Int): Unit =
      nums(i) = (1 to i / 2).foldLeft(startMax)((maxValue, j) =>
        maxValue.max(nums(j) * nums(i - j))
      )

    val buffer = Array.fill(n + 1)(0)
    (1 until n).foreach(i => fillItem(buffer, i, i))
    fillItem(buffer, 0, n)

    buffer.last
  }
}
