package minCostClimbingStairs

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 15" in {
    val cost = Array(10, 15, 20)

    assert(Solution.minCostClimbingStairs(cost) == 15)
  }

  "example 2" should "return 6" in {
    val cost = Array(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)

    assert(Solution.minCostClimbingStairs(cost) == 6)
  }
}
