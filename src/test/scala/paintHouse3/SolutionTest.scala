package paintHouse3

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 9" in {
    val houses = Array(0, 0, 0, 0, 0)
    val cost =
      Array(Array(1, 10), Array(10, 1), Array(10, 1), Array(1, 10), Array(5, 1))
    val m = 5
    val n = 2
    val target = 3

    assert(Solution.minCost(houses, cost, m, n, target) == 9)
  }
}
