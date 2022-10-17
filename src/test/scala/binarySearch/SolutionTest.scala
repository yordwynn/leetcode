package binarySearch

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 4" in {
    val nums = Array(-1, 0, 3, 5, 9, 12)
    val target = 9
    assert(Solution.search(nums, target) == 4)
  }

  "example 2" should "return -1" in {
    val nums = Array(-1, 0, 3, 5, 9, 12)
    val target = 2
    assert(Solution.search(nums, target) == -1)
  }
}
