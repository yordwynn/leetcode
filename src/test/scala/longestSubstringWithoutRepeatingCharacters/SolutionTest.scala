package longestSubstringWithoutRepeatingCharacters

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 3" in {
    val s = "abcabcbb"
    assert(Solution.lengthOfLongestSubstring(s) == 3)
  }

  "example 2" should "return 1" in {
    val s = "bbbbb"
    assert(Solution.lengthOfLongestSubstring(s) == 1)
  }

  "example 3" should "return 3" in {
    val s = "pwwkew"
    assert(Solution.lengthOfLongestSubstring(s) == 3)
  }

  "example 4" should "return 2" in {
    val s = "abba"
    assert(Solution.lengthOfLongestSubstring(s) == 2)
  }

  "example 5" should "return 5" in {
    val s = "tmmzuxt"
    assert(Solution.lengthOfLongestSubstring(s) == 5)
  }
}
