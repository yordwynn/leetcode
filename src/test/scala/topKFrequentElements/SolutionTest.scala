package topKFrequentElements

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,2]" in {
    val nums = Array(1, 1, 1, 2, 2, 3)
    val k = 2
    assert(Solution.topKFrequent(nums, k) sameElements Array(2, 1))
  }

  "example 2" should "return [1]" in {
    val nums = Array(1)
    val k = 1
    assert(Solution.topKFrequent(nums, k) sameElements Array(1))
  }
}
