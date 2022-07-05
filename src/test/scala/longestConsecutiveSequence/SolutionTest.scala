package longestConsecutiveSequence

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 4" in {
    val nums = Array(100, 4, 200, 1, 3, 2)
    assert(Solution.longestConsecutive(nums) == 4)
  }

  "example 2" should "return 9" in {
    val nums = Array(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
    assert(Solution.longestConsecutive(nums) == 9)
  }
}
