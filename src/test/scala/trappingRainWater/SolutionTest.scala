package trappingRainWater

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 6" in {
    val height = Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    assert(Solution.trap(height) == 6)
  }

  "example 2" should "return 9" in {
    val height = Array(4, 2, 0, 3, 2, 5)
    assert(Solution.trap(height) == 9)
  }
}
