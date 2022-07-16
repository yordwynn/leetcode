package maxAreaOfIsland

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 6" in {
    val grid = Array(
      Array(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
      Array(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
      Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
      Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
    )
    assert(Solution.maxAreaOfIsland(grid) == 6)
  }

  "example 2" should "return 0" in {
    val grid = Array(Array(0, 0, 0, 0, 0, 0, 0, 0))
    assert(Solution.maxAreaOfIsland(grid) == 0)
  }

  "example 3" should "return 6" in {
    val grid = Array(
      Array(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
      Array(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
      Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
      Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
    )
    assert(Solution.maxAreaOfIsland(grid) == 6)
  }
}
