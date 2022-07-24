package searchA2DMatrix2

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val matrix = Array(
      Array(1, 4, 7, 11, 15),
      Array(2, 5, 8, 12, 19),
      Array(3, 6, 9, 16, 22),
      Array(10, 13, 14, 17, 24),
      Array(18, 21, 23, 26, 30)
    )
    val target = 5
    assert(Solution.searchMatrix(matrix, target))
  }

  "example 2" should "return false" in {
    val matrix = Array(
      Array(1, 4, 7, 11, 15),
      Array(2, 5, 8, 12, 19),
      Array(3, 6, 9, 16, 22),
      Array(10, 13, 14, 17, 24),
      Array(18, 21, 23, 26, 30)
    )
    val target = 20
    assert(!Solution.searchMatrix(matrix, target))
  }
}
