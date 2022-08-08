package longestIncreasingSubsequence

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 4" in {
    val nums = Array(10, 9, 2, 5, 3, 7, 101, 18)
    assert(Solution.lengthOfLIS(nums) == 4)
  }

  "example 2" should "return 4" in {
    val nums = Array(0, 1, 0, 3, 2, 3)
    assert(Solution.lengthOfLIS(nums) == 4)
  }

  "example 3" should "return 1" in {
    val nums = Array(7, 7, 7, 7, 7, 7, 7)
    assert(Solution.lengthOfLIS(nums) == 1)
  }

  "example 4" should "return 3" in {
    val nums = Array(4, 10, 4, 3, 8, 9)
    assert(Solution.lengthOfLIS(nums) == 3)
  }

  "example 5" should "return 6" in {
    val nums = Array(1, 3, 6, 7, 9, 4, 10, 5, 6)
    assert(Solution.lengthOfLIS(nums) == 6)
  }
}
