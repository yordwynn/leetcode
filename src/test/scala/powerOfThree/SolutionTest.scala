package powerOfThree

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val n = 27
    assert(Solution.isPowerOfThree(n))
  }

  "example 2" should "return false" in {
    val n = 0
    assert(!Solution.isPowerOfThree(n))
  }

  "example 3" should "return true" in {
    val n = 9
    assert(Solution.isPowerOfThree(n))
  }

  "example 4" should "return true" in {
    val n = 243
    assert(Solution.isPowerOfThree(n))
  }
}
