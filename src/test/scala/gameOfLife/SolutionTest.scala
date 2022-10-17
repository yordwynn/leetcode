package gameOfLife

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.{convertToAnyShouldWrapper, equal}

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]" in {
    val board =
      Array(Array(0, 1, 0), Array(0, 0, 1), Array(1, 1, 1), Array(0, 0, 0))
    val expected =
      Array(Array(0, 0, 0), Array(1, 0, 1), Array(0, 1, 1), Array(0, 1, 0))
    Solution.gameOfLife(board)
    board should equal(expected)
  }

  "example 2" should "return [[1,1],[1,1]]" in {
    val board = Array(Array(1, 1), Array(1, 0))
    val expected = Array(Array(1, 1), Array(1, 1))
    Solution.gameOfLife(board)
    board should equal(expected)
  }
}
