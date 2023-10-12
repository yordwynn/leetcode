package minimumNumberOfOperationsToMakeArrayContinuous

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 0" in {
    val nums = Array(4, 2, 5, 3)
    assert(Solution.minOperations(nums) == 0)
  }

  "example 2" should "return 1" in {
    val nums = Array(1, 2, 3, 5, 6)
    assert(Solution.minOperations(nums) == 1)
  }

  "example 2" should "return 3" in {
    val nums = Array(1, 10, 100, 1000)
    assert(Solution.minOperations(nums) == 3)
  }

  "example 3" should "return 2" in {
    val nums = Array(11, 5, 9, 10, 8, 4)
    assert(Solution.minOperations(nums) == 2)
  }

  "example 4" should "return 5" in {
    val nums = Array(41, 33, 29, 33, 35, 26, 47, 24, 18, 28)
    assert(Solution.minOperations(nums) == 5)
  }
}
