package boatsToSavePeople

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 1" in {
    val people = Array(1, 2)
    val limit = 3
    assert(Solution.numRescueBoats(people, limit) == 1)
  }

  "example 2" should "return 3" in {
    val people = Array(3, 2, 2, 1)
    val limit = 3
    assert(Solution.numRescueBoats(people, limit) == 3)
  }
}
