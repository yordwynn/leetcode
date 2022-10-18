package countAndSay

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should """return "1" """ in {
    val n = 1
    assert(Solution.countAndSay(n) == "1")
  }

  "example 2" should """return "1211" """ in {
    val n = 4
    assert(Solution.countAndSay(n) == "1211")
  }
}
