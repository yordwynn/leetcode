package numberOfMatchingSubsequences

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 3" in {
    val s = "abcde"
    val words = Array("a", "bb", "acd", "ace")
    assert(Solution.numMatchingSubseq(s, words) == 3)
  }

  "example 2" should "return 2" in {
    val s = "dsahjpjauf"
    val words = Array("ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax")
    assert(Solution.numMatchingSubseq(s, words) == 2)
  }
}
