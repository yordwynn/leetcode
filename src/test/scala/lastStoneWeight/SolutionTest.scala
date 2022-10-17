package lastStoneWeight

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 1" in {
    val stones = Array(2, 7, 4, 1, 8, 1)
    assert(Solution.lastStoneWeight(stones) == 1)
  }

  "example 2" should "return 1" in {
    val stones = Array(1)
    assert(Solution.lastStoneWeight(stones) == 1)
  }
}
