package example

object NextPermutation {
  def main(args: Array[String]): Unit = {
    val x = Array(1, 5, 1)
    nextPermutation(x)
    println(x.mkString)
  }

  def nextPermutation(nums: Array[Int]): Unit = {
    def swap(i: Int, j: Int): Unit = {
      val b = nums(i)
      nums(i) = nums(j)
      nums(j) = b
    }

    def reverse(start: Int): Unit = {
      var i = start
      var j = nums.length - 1

      while (i < j) {
        swap(i, j)
        i = i + 1
        j = j - 1
      }
    }

    var i = nums.length - 1

    while (i > 0 && nums(i - 1) >= nums(i))
      i = i - 1

    if (i > 0) {
      var j = nums.length - 1

      while (j > i - 1 && nums(j) <= nums(i - 1))
        j = j - 1

      swap(i - 1, j)
    }

    reverse(i)
  }
}
