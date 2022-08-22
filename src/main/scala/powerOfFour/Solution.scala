package powerOfFour

// 342. Power of Four
object Solution {
  def isPowerOfFour(n: Int): Boolean = {
    val pow = Math.log(n) / Math.log(4)
    (pow - pow.toInt) < Double.MinPositiveValue && n > 0
  }
}
