package containsDuplicate2

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val nums = Array(1, 2, 3, 1)
    val k = 3
    assert(Solution.containsNearbyDuplicate(nums, k))
  }

  "example 2" should "return true" in {
    val nums = Array(1, 0, 1, 1)
    val k = 1
    assert(Solution.containsNearbyDuplicate(nums, k))
  }

  "example 3" should "return false" in {
    val nums = Array(1, 2, 3, 1, 2, 3)
    val k = 2
    assert(!Solution.containsNearbyDuplicate(nums, k))
  }

  "example 4" should "return true" in {
    val nums = Array(99, 99)
    val k = 2
    assert(Solution.containsNearbyDuplicate(nums, k))
  }

  "example 5" should "return false" in {
    val nums = Array(1, 2, 1)
    val k = 0
    assert(!Solution.containsNearbyDuplicate(nums, k))
  }
}
