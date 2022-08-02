package kthSmallestElementInASortedMatrix

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 13" in {
    val matrix = Array(Array(1, 5, 9), Array(10, 11, 13), Array(12, 13, 15))
    val k = 8
    assert(Solution.kthSmallest(matrix, k) == 13)
  }

  "example 2" should "return -5" in {
    val matrix = Array(Array(-5))
    val k = 1
    assert(Solution.kthSmallest(matrix, k) == -5)
  }

  "example 3" should "return 5" in {
    val matrix = Array(
      Array(1, 4, 7, 11, 15),
      Array(2, 5, 8, 12, 19),
      Array(3, 6, 9, 16, 22),
      Array(10, 13, 14, 17, 24),
      Array(18, 21, 23, 26, 30)
    )
    val k = 5
    assert(Solution.kthSmallest(matrix, k) == 5)
  }

}
