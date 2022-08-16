package firstUniqueCharacterInAString

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 0" in {
    val s = "leetcode"
    assert(Solution.firstUniqChar(s) == 0)
  }

  "example 2" should "return 2" in {
    val s = "loveleetcode"
    assert(Solution.firstUniqChar(s) == 2)
  }

  "example 3" should "return -1" in {
    val s = "aabb"
    assert(Solution.firstUniqChar(s) == -1)
  }
}
