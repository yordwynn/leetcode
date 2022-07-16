package outOfBoundaryPaths

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 6" in {
    val m = 2
    val n = 2
    val maxMove = 2
    val startRow = 0
    val startColumn = 0
    assert(Solution.findPaths(m, n, maxMove, startRow, startColumn) == 6)
  }

  "example 2" should "return 12" in {
    val m = 1
    val n = 3
    val maxMove = 3
    val startRow = 0
    val startColumn = 1
    assert(Solution.findPaths(m, n, maxMove, startRow, startColumn) == 12)
  }

  "example 3" should "return 914783380" in {
    val m = 8
    val n = 50
    val maxMove = 23
    val startRow = 5
    val startColumn = 26
    assert(
      Solution.findPaths(m, n, maxMove, startRow, startColumn) == 914783380
    )
  }
}
