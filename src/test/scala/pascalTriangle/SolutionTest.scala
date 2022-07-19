package pascalTriangle

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]" in {
    val numRows = 5
    val res = List(
      List(1),
      List(1, 1),
      List(1, 2, 1),
      List(1, 3, 3, 1),
      List(1, 4, 6, 4, 1)
    )
    assert(Solution.generate(numRows) == res)
  }

  "example 2" should "return [[1]]" in {
    val numRows = 1
    val res = List(List(1))
    assert(Solution.generate(numRows) == res)
  }
}
