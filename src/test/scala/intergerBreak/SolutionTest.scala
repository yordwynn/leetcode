package intergerBreak

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 1" in {
    val n = 2

    assert(Solution.integerBreak(n) == 1)
  }

  "example 2" should "return 36" in {
    val n = 10

    assert(Solution.integerBreak(n) == 36)
  }
}
