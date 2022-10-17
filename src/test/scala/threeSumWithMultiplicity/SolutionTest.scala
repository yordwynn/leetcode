package threeSumWithMultiplicity

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 20" in {
    val arr = Array(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    val target = 8
    assert(Solution.threeSumMulti(arr, target) == 20)
  }

  "example 3" should "return 12" in {
    val arr = Array(1, 1, 2, 2, 2, 2)
    val target = 5
    assert(Solution.threeSumMulti(arr, target) == 12)
  }

  "example 3" should "return 1" in {
    val arr = Array(2, 1, 3)
    val target = 6
    assert(Solution.threeSumMulti(arr, target) == 1)
  }
}
