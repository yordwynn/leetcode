package romanToInteger

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 3" in {
    val s = "III"
    assert(Solution.romanToInt(s) == 3)
  }

  "example 2" should "return 58" in {
    val s = "LVIII"
    assert(Solution.romanToInt(s) == 58)
  }

  "example 3" should "return 1994" in {
    val s = "MCMXCIV"
    assert(Solution.romanToInt(s) == 1994)
  }

  "example 4" should "return 4" in {
    val s = "IV"
    assert(Solution.romanToInt(s) == 4)
  }
}
