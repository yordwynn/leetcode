package baseballGame

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 30" in {
    val ops = Array("5", "2", "C", "D", "+")
    assert(Solution.calPoints(ops) == 30)
  }

  "example 2" should "return 27" in {
    val ops = Array("5", "-2", "4", "C", "D", "9", "+", "+")
    assert(Solution.calPoints(ops) == 27)
  }

  "example 3" should "return 0" in {
    val ops = Array("1", "C")
    assert(Solution.calPoints(ops) == 0)
  }
}
