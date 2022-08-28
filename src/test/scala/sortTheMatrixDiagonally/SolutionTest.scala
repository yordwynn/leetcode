package sortTheMatrixDiagonally

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[1,1,1,1],[1,2,2,2],[1,2,3,3]]" in {
    val mat = Array(Array(3, 3, 1, 1), Array(2, 2, 1, 2), Array(1, 1, 1, 2))
    val res = Array(Array(1, 1, 1, 1), Array(1, 2, 2, 2), Array(1, 2, 3, 3))
    assert(Solution.diagonalSort(mat).zipWithIndex.forall { case (arr, i) =>
      arr sameElements res(i)
    })
  }

  "example 2" should "return [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]" in {
    val mat =
      Array(
        Array(11, 25, 66, 1, 69, 7),
        Array(23, 55, 17, 45, 15, 52),
        Array(75, 31, 36, 44, 58, 8),
        Array(22, 27, 33, 25, 68, 4),
        Array(84, 28, 14, 11, 5, 50)
      )
    val res = Array(
      Array(5, 17, 4, 1, 52, 7),
      Array(11, 11, 25, 45, 8, 69),
      Array(14, 23, 25, 44, 58, 15),
      Array(22, 27, 31, 36, 50, 66),
      Array(84, 28, 75, 33, 55, 68)
    )
    assert(Solution.diagonalSort(mat).zipWithIndex.forall { case (arr, i) =>
      arr sameElements res(i)
    })
  }
}
