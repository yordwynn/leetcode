package example

object DuplicateNumber {
  def main(args: Array[String]): Unit = {
    val x = Array(3, 1, 3, 4, 2)
    println(findDuplicate(x))
  }

  def findDuplicate(nums: Array[Int]): Int = {
    def go(l: Int, r: Int): Int = {
      val m = l + (r - l) / 2
      if (l < r) {
        val lessThanM = lessThan(m)
        if (lessThanM > m)
          go(l, m)
        else
          go(m + 1, r)
      } else
        m
    }

    def lessThan(n: Int): Int = {
      nums.count(_ <= n)
    }

    go(0, nums.length - 1)
  }
}
