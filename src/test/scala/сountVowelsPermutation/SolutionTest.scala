package сountVowelsPermutation

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 5" in {
    val n = 1
    assert(Solution.countVowelPermutation(n) == 5)
  }

  "example 2" should "return 10" in {
    val n = 2
    assert(Solution.countVowelPermutation(n) == 10)
  }

  "example 3" should "return 68" in {
    val n = 5
    assert(Solution.countVowelPermutation(n) == 68)
  }
}
