package minimumNumberOfRefuelingStops

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 0" in {
    val target = 1
    val startFuel = 1
    val stations = Array.empty[Array[Int]]

    assert(Solution.minRefuelStops(target, startFuel, stations) == 0)
  }

  "example 2" should "return -1" in {
    val target = 100
    val startFuel = 1
    val stations = Array(Array(10, 100))

    assert(Solution.minRefuelStops(target, startFuel, stations) == -1)
  }

  "example 3" should "return 2" in {
    val target = 100
    val startFuel = 10
    val stations =
      Array(Array(10, 60), Array(20, 30), Array(30, 30), Array(60, 40))

    assert(Solution.minRefuelStops(target, startFuel, stations) == 2)
  }

  "example 4" should "return 4" in {
    val target = 1000
    val startFuel = 299

    val stations =
      Array(
        Array(13, 21),
        Array(26, 115),
        Array(100, 47),
        Array(225, 99),
        Array(299, 141),
        Array(444, 198),
        Array(608, 190),
        Array(636, 157),
        Array(647, 255),
        Array(841, 123)
      )

    assert(Solution.minRefuelStops(target, startFuel, stations) == 4)
  }

  "example 5" should "return -1" in {
    val target = 100
    val startFuel = 50
    val stations = Array(Array(25, 30))

    assert(Solution.minRefuelStops(target, startFuel, stations) == -1)
  }

  "example 6" should "return -1" in {
    val target = 1000
    val startFuel = 83
    val stations = Array(
      Array(22, 17),
      Array(100, 23),
      Array(121, 71),
      Array(141, 77),
      Array(236, 4),
      Array(438, 78),
      Array(500, 76),
      Array(642, 66),
      Array(672, 20),
      Array(685, 81)
    )

    assert(Solution.minRefuelStops(target, startFuel, stations) == -1)
  }

  "example 7" should "return -1" in {
    val target = 1000
    val startFuel = 83
    val stations = Array(
      Array(25, 27),
      Array(36, 187),
      Array(140, 186),
      Array(378, 6),
      Array(492, 202),
      Array(517, 89),
      Array(579, 234),
      Array(673, 86),
      Array(808, 53),
      Array(954, 49)
    )

    assert(Solution.minRefuelStops(target, startFuel, stations) == -1)
  }
}
