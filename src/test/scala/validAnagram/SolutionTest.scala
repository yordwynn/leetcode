package validAnagram

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val s = "anagram"
    val t = "nagaram"
    assert(Solution.isAnagram(s, t))
  }

  "example 2" should "return flase" in {
    val s = "rat"
    val t = "car"
    assert(!Solution.isAnagram(s, t))
  }
}
