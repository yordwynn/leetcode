package shift2dGreed

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[9,1,2],[3,4,5],[6,7,8]]" in {
    val grid = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    val k = 1
    val expected = List(List(9, 1, 2), List(3, 4, 5), List(6, 7, 8))
    assert(Solution.shiftGrid(grid, k) == expected)
  }

  "example 2" should "return [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]" in {
    val grid = Array(
      Array(3, 8, 1, 9),
      Array(19, 7, 2, 5),
      Array(4, 6, 11, 10),
      Array(12, 0, 21, 13)
    )
    val k = 4
    val expected = List(
      List(12, 0, 21, 13),
      List(3, 8, 1, 9),
      List(19, 7, 2, 5),
      List(4, 6, 11, 10)
    )
    assert(Solution.shiftGrid(grid, k) == expected)
  }

  "example 3" should "return [[1,2,3],[4,5,6],[7,8,9]]" in {
    val grid = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    val k = 9
    val expected = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    assert(Solution.shiftGrid(grid, k) == expected)
  }
}
