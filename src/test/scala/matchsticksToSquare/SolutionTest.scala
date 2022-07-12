package matchsticksToSquare

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val matchsticks = Array(1, 1, 2, 2, 2)
    assert(Solution.makesquare(matchsticks))
  }

  "example 2" should "return false" in {
    val matchsticks = Array(3, 3, 3, 3, 4)
    assert(!Solution.makesquare(matchsticks))
  }

  "example 3" should "return true" in {
    val matchsticks = Array(5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3)
    assert(Solution.makesquare(matchsticks))
  }
}
