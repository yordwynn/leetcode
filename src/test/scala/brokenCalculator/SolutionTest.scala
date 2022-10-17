package brokenCalculator

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 2" in {
    val startValue = 2
    val target = 3
    assert(Solution.brokenCalc(startValue, target) == 2)
  }

  "example 2" should "return 2" in {
    val startValue = 5
    val target = 8
    assert(Solution.brokenCalc(startValue, target) == 2)
  }

  "example 3" should "return 3" in {
    val startValue = 3
    val target = 10
    assert(Solution.brokenCalc(startValue, target) == 3)
  }
}
