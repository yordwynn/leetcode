package jumpGame6

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 7" in {
    val nums = Array(1, -1, -2, 4, -7, 3)
    val k = 2

    assert(Solution.maxResult(nums, k) == 7)
  }

  "example 2" should "return 17" in {
    val nums = Array(10, -5, -2, 4, 0, 3)
    val k = 3

    assert(Solution.maxResultSlow(nums, k) == 17)
  }

  "example 3" should "return 0" in {
    val nums = Array(1, -5, -20, 4, -1, 3, -6, -3)
    val k = 2

    assert(Solution.maxResultSlow(nums, k) == 0)
  }
}
