package wiggleSubsequence

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "equal 6" in {
    val nums = Array(1, 7, 4, 9, 2, 5)

    assert(Solution.wiggleMaxLength(nums) == 6)
  }

  "example 2" should "equal 7" in {
    val nums = Array(1, 17, 5, 10, 13, 15, 10, 5, 16, 8)

    assert(Solution.wiggleMaxLength(nums) == 7)
  }

  "example 3" should "equal 2" in {
    val nums = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

    assert(Solution.wiggleMaxLength(nums) == 2)
  }
}
