package maximumUnitsOnATruck

// 1710. Maximum Units on a Truck
object Solution {
  def maximumUnits(boxTypes: Array[Array[Int]], truckSize: Int): Int = {
    case class Result(units: Int, capacity: Int)
    val sorted =
      boxTypes.sorted(Ordering.by[Array[Int], Int](i => i(1)).reverse)
    sorted
      .foldLeft(Result(0, truckSize))((acc, i) =>
        if (acc.capacity == 0) acc
        else if (acc.capacity > i(0))
          Result(i(1) * i(0) + acc.units, acc.capacity - i(0))
        else Result(i(1) * acc.capacity + acc.units, 0)
      )
      .units
  }
}
