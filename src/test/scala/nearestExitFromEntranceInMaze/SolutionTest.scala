package nearestExitFromEntranceInMaze

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  it should "return 1" in {
    val maze = Array(
      Array('+', '+', '.', '+'),
      Array('.', '.', '.', '+'),
      Array('+', '+', '+', '.')
    )
    val entrance = Array(1, 2)
    assert(Solution.nearestExit(maze, entrance) == 1)
  }

  it should "return 2" in {
    val maze = Array(
      Array('+', '+', '+'),
      Array('.', '.', '.'),
      Array('+', '+', '+')
    )
    val entrance = Array(1, 0)
    assert(Solution.nearestExit(maze, entrance) == 2)
  }

  it should "return -1" in {
    val maze = Array(Array('.', '+'))
    val entrance = Array(0, 0)
    assert(Solution.nearestExit(maze, entrance) == -1)
  }

  it should "return 12" in {
    val maze = Array(
      Array('+', '.', '+', '+', '+', '+', '+'),
      Array('+', '.', '+', '.', '.', '.', '+'),
      Array('+', '.', '+', '.', '+', '.', '+'),
      Array('+', '.', '.', '.', '+', '.', '+'),
      Array('+', '+', '+', '+', '+', '.', '+')
    )
    val entrance = Array(0, 1)
    assert(Solution.nearestExit(maze, entrance) == 12)
  }
}
