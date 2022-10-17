package validPalindrome2

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val s = "aba"
    assert(Solution.validPalindrome(s))
  }

  "example 2" should "return true" in {
    val s = "abca"
    assert(Solution.validPalindrome(s))
  }

  "example 3" should "return false" in {
    val s = "abc"
    assert(!Solution.validPalindrome(s))
  }
}
