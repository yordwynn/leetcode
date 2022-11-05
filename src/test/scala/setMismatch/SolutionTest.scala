package setMismatch

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [2,3]" in {
    val nums = Array(1, 2, 2, 4)
    assert(Solution.findErrorNums(nums) sameElements Array(2, 3))
  }

  "example 2" should "return [1,2]" in {
    val nums = Array(1, 1)
    assert(Solution.findErrorNums(nums) sameElements Array(1, 2))
  }
}
