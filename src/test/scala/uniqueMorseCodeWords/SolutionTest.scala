package uniqueMorseCodeWords

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 2" in {
    val words = Array("gin", "zen", "gig", "msg")
    assert(Solution.uniqueMorseRepresentations(words) == 2)
  }

  "example 2" should "return 1" in {
    val words = Array("a")
    assert(Solution.uniqueMorseRepresentations(words) == 1)
  }
}
