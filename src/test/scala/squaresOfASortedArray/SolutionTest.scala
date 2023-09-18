package squaresOfASortedArray

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  it should "return [0,1,9,16,100]" in {
    val nums = Array(-4, -1, 0, 3, 10)
    val expected = Array(0, 1, 9, 16, 100)
    val result = Solution.sortedSquares(nums)

    assert(result sameElements expected)
  }

  it should "return [4,9,9,49,121]" in {
    val nums = Array(-7, -3, 2, 3, 11)
    val expected = Array(4, 9, 9, 49, 121)
    val result = Solution.sortedSquares(nums)

    assert(result sameElements expected)
  }
}
