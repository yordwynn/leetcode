package searchA2dMatrix

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val matrix =
      Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60))
    val target = 3
    assert(Solution.searchMatrix(matrix, target))
  }

  "example 2" should "return false" in {
    val matrix =
      Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60))
    val target = 13
    assert(!Solution.searchMatrix(matrix, target))
  }
}
