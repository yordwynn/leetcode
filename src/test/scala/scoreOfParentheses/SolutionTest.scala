package scoreOfParentheses

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 1" in {
    val s = "()"
    assert(Solution.scoreOfParentheses(s) == 1)
  }

  "example 2" should "return 2" in {
    val s = "(())"
    assert(Solution.scoreOfParentheses(s) == 2)
  }

  "example 3" should "return 2" in {
    val s = "()()"
    assert(Solution.scoreOfParentheses(s) == 2)
  }
}
