package integerToRoman

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return III" in {
    val num = 3
    assert(Solution.intToRoman(num) == "III")
  }

  "example 2" should "return LVIII" in {
    val num = 58
    assert(Solution.intToRoman(num) == "LVIII")
  }

  "example 3" should "return MCMXCIV" in {
    val num = 1994
    assert(Solution.intToRoman(num) == "MCMXCIV")
  }
}
