package spiralMatrix2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.{convertToAnyShouldWrapper, equal}

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[1,2,3],[8,9,4],[7,6,5]]" in {
    val n = 3
    val expected = Array(Array(1, 2, 3), Array(8, 9, 4), Array(7, 6, 5))
    val actual = Solution.generateMatrix(n)
    expected should equal(actual)
  }

  "example 2" should "return [[1]]" in {
    val n = 1
    val expected = Array(Array(1))
    val actual = Solution.generateMatrix(n)
    expected should equal(actual)
  }
}
