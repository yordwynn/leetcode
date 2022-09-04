package numbersWithSameConsecutiveDifferences

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [181,292,707,818,929]" in {
    val n = 3
    val k = 7
    assert(
      Solution
        .numsSameConsecDiff(n, k) sameElements Array(181, 292, 707, 818, 929)
    )
  }

  "example 2" should "return [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]" in {
    val n = 2
    val k = 1
    assert(
      Solution.numsSameConsecDiff(n, k).sorted sameElements Array(10, 12, 21,
        23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98)
    )
  }

  "example 3" should "return [11,22,33,44,55,66,77,88,99]" in {
    val n = 2
    val k = 0
    assert(
      Solution.numsSameConsecDiff(n, k).sorted sameElements Array(11, 22, 33,
        44, 55, 66, 77, 88, 99)
    )
  }
}
