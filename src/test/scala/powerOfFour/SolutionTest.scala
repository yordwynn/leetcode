package powerOfFour

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val n = 16
    assert(Solution.isPowerOfFour(n))
  }

  "example 2" should "return false" in {
    val n = 5
    assert(!Solution.isPowerOfFour(n))
  }

  "example 3" should "return true" in {
    val n = 1
    assert(Solution.isPowerOfFour(n))
  }

  "example 4" should "return true" in {
    val n = 8
    assert(!Solution.isPowerOfFour(n))
  }

  "example 5" should "return true" in {
    val n = 17
    assert(!Solution.isPowerOfFour(n))
  }
}
