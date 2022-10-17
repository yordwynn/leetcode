package nextPremutation

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,3,2]" in {
    val nums = Array(1, 2, 3)
    Solution.nextPermutation(nums)
    assert(nums sameElements Array(1, 3, 2))
  }

  "example 2" should "return [1,2,3]" in {
    val nums = Array(3, 2, 1)
    Solution.nextPermutation(nums)
    assert(nums sameElements Array(1, 2, 3))
  }

  "example 3" should "return [1,5,1]" in {
    val nums = Array(1, 1, 5)
    Solution.nextPermutation(nums)
    assert(nums sameElements Array(1, 5, 1))
  }
}
