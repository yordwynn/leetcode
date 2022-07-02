package MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 4" in {
    val h = 5
    val w = 4
    val horizontalCuts = Array(1, 2, 4)
    val verticalCuts = Array(1, 3)

    assert(Solution.maxArea(h, w, horizontalCuts, verticalCuts) == 4)
  }

  "example 2" should "return 6" in {
    val h = 5
    val w = 4
    val horizontalCuts = Array(3, 1)
    val verticalCuts = Array(1)

    assert(Solution.maxArea(h, w, horizontalCuts, verticalCuts) == 6)
  }

  "example 3" should "return 9" in {
    val h = 5
    val w = 4
    val horizontalCuts = Array(3)
    val verticalCuts = Array(3)

    assert(Solution.maxArea(h, w, horizontalCuts, verticalCuts) == 9)
  }
}
