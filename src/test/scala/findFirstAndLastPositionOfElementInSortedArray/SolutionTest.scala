package findFirstAndLastPositionOfElementInSortedArray

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [3, 4]" in {
    val nums = Array(5, 7, 7, 8, 8, 10)
    val target = 8
    val res = Array(3, 4)

    assert(Solution.searchRange(nums, target) sameElements res)
  }

  "example 2" should "return [-1, -1]" in {
    val nums = Array(5, 7, 7, 8, 8, 10)
    val target = 6
    val res = Array(-1, -1)

    assert(Solution.searchRange(nums, target) sameElements res)
  }

  "example 3" should "return []" in {
    val nums = Array.empty[Int]
    val target = 0
    val res = Array(-1, -1)

    assert(Solution.searchRange(nums, target) sameElements res)
  }

  "example 4" should "return [0, 0]" in {
    val nums = Array(1, 3)
    val target = 1
    val res = Array(0, 0)

    assert(Solution.searchRange(nums, target) sameElements res)
  }

  "example 5" should "return [-1, -1]" in {
    val nums = Array(2, 2)
    val target = 3
    val res = Array(-1, -1)

    assert(Solution.searchRange(nums, target) sameElements res)
  }

  "example 5" should "return [0, 1]" in {
    val nums = Array(2, 2)
    val target = 2
    val res = Array(0, 1)

    assert(Solution.searchRange(nums, target) sameElements res)
  }
}
