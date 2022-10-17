package minimumDominoRotationsForEqualRow

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 2" in {
    val tops = Array(2, 1, 2, 4, 2, 2)
    val bottoms = Array(5, 2, 6, 2, 3, 2)
    assert(Solution.minDominoRotations(tops, bottoms) == 2)
  }

  "example 2" should "return -1" in {
    val tops = Array(3, 5, 1, 2, 3)
    val bottoms = Array(3, 6, 3, 3, 4)
    assert(Solution.minDominoRotations(tops, bottoms) == -1)
  }
}
