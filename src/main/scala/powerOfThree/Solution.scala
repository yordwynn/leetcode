package powerOfThree

object Solution {
  def isPowerOfThree(n: Int): Boolean = {
    val pow = Math.log10(n) / math.log10(3)
    math.abs(pow % 1) < Double.MinPositiveValue
  }
}
