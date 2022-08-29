package numberOfIslands

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 1" in {
    val grid = Array(
      Array('1', '1', '1', '1', '0'),
      Array('1', '1', '0', '1', '0'),
      Array('1', '1', '0', '0', '0'),
      Array('0', '0', '0', '0', '0')
    )
    assert(Solution.numIslands(grid) == 1)
  }

  "example 2" should "return 3" in {
    val grid = Array(
      Array('1', '1', '0', '0', '0'),
      Array('1', '1', '0', '0', '0'),
      Array('0', '0', '1', '0', '0'),
      Array('0', '0', '0', '1', '1')
    )
    assert(Solution.numIslands(grid) == 3)
  }

  "example 3" should "return 3" in {
    val grid = Array(Array('1', '0', '1', '1', '0', '1', '1'))
    assert(Solution.numIslands(grid) == 3)
  }
}
