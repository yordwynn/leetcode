package findOriginalArrayFromDoubledArray

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1, 3, 4]" in {
    val changed = Array(1, 3, 4, 2, 6, 8)
    assert(Solution.findOriginalArray(changed) sameElements Array(1, 3, 4))
  }

  "example 2" should "return []" in {
    val changed = Array(6, 3, 0, 1)
    assert(Solution.findOriginalArray(changed) sameElements Array.empty[Int])
  }

  "example 3" should "return []" in {
    val changed = Array(1)
    assert(Solution.findOriginalArray(changed) sameElements Array.empty[Int])
  }
}
