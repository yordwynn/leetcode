package uniquePaths

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 28" in {
    val m = 3
    val n = 7

    assert(Solution.uniquePaths(m, n) == 28)
  }

  "example 2" should "return 3" in {
    val m = 3
    val n = 2

    assert(Solution.uniquePaths(m, n) == 3)
  }
}
