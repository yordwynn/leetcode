package maximumUnitsOnATruck

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 8" in {
    val boxTypes = Array(Array(1, 3), Array(2, 2), Array(3, 1))
    val truckSize = 4

    assert(Solution.maximumUnits(boxTypes, truckSize) == 8)
  }

  "example 2" should "return 91" in {
    val boxTypes = Array(Array(5, 10), Array(2, 5), Array(4, 7), Array(3, 9))
    val truckSize = 10

    assert(Solution.maximumUnits(boxTypes, truckSize) == 91)
  }
}
