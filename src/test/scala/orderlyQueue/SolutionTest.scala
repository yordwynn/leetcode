package orderlyQueue

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return cba" in {
    val s = "cba"
    val k = 1
    assert(Solution.orderlyQueue(s, k) == "acb")
  }

  "example 2" should "return aaabc" in {
    val s = "baaca"
    val k = 3
    assert(Solution.orderlyQueue(s, k) == "aaabc")
  }
}
