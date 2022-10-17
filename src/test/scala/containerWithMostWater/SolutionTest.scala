package containerWithMostWater

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 49" in {
    val height = Array(1, 8, 6, 2, 5, 4, 8, 3, 7)
    assert(Solution.maxArea(height) == 49)
  }

  "example 2" should "return 1" in {
    val height = Array(1, 1)
    assert(Solution.maxArea(height) == 1)
  }
}
