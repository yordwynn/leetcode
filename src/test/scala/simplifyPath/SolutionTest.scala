package simplifyPath

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should """return "/home" """ in {
    val path = "/home/"
    assert(Solution.simplifyPath(path) == "/home")
  }

  "example 2" should """return "/" """ in {
    val path = "/../"
    assert(Solution.simplifyPath(path) == "/")
  }

  "example 3" should """return "/home/foo" """ in {
    val path = "/home//foo/"
    assert(Solution.simplifyPath(path) == "/home/foo")
  }
}
