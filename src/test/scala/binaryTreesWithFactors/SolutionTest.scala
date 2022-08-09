package binaryTreesWithFactors

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 3" in {
    val arr = Array(2, 4)
    assert(Solution.numFactoredBinaryTrees(arr) == 3)
  }

  "example 2" should "return 7" in {
    val arr = Array(2, 4, 5, 10)
    assert(Solution.numFactoredBinaryTrees(arr) == 7)
  }
}
