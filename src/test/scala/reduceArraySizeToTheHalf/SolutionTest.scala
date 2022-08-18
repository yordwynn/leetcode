package reduceArraySizeToTheHalf

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 2" in {
    val arr = Array(3, 3, 3, 3, 5, 5, 5, 2, 2, 7)
    assert(Solution.minSetSize(arr) == 2)
  }

  "example 2" should "return 1" in {
    val arr = Array(7, 7, 7, 7, 7, 7)
    assert(Solution.minSetSize(arr) == 1)
  }
}
