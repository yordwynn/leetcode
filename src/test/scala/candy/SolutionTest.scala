package candy

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 5" in {
    val ratings = Array(1, 0, 2)

    assert(Solution.candy(ratings) == 5)
  }

  "example 2" should "return 4" in {
    val ratings = Array(1, 2, 2)

    assert(Solution.candy(ratings) == 4)
  }
}
