package reverseString

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should """return ["o","l","l","e","h"]""" in {
    val s = Array('h', 'e', 'l', 'l', 'o')
    Solution.reverseString(s)
    assert(s sameElements Array('o', 'l', 'l', 'e', 'h'))
  }

  "example 2" should """return ["h","a","n","n","a","H"]""" in {
    val s = Array('H', 'a', 'n', 'n', 'a', 'h')
    Solution.reverseString(s)
    assert(s sameElements Array('h', 'a', 'n', 'n', 'a', 'H'))
  }
}
