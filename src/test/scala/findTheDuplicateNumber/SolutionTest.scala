package findTheDuplicateNumber

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 2" in {
    val nums = Array(1, 3, 4, 2, 2)
    assert(Solution.findDuplicate(nums) == 2)
  }

  "example 2" should "return 3" in {
    val nums = Array(3, 1, 3, 4, 2)
    assert(Solution.findDuplicate(nums) == 3)
  }
}
