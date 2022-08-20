package minimumNumberOfRefuelingStops

import scala.annotation.tailrec
import scala.collection.mutable

// 871. Minimum Number of Refueling Stops
object Solution {
  def minRefuelStops(
      target: Int,
      startFuel: Int,
      stations: Array[Array[Int]]
  ): Int = {
    @tailrec
    def getRefill(
        res: Int,
        stops: Int,
        target: Int,
        refills: mutable.PriorityQueue[Int]
    ): Option[(Int, Int)] = {
      if (res >= target)
        Some((res, stops))
      else if (refills.isEmpty)
        None
      else
        getRefill(res + refills.dequeue(), stops + 1, target, refills)
    }

    @tailrec
    def go(
        skipped: mutable.PriorityQueue[Int],
        i: Int,
        fuel: Int,
        res: Int
    ): Int = {
      if (i >= stations.length) {
        if (fuel >= target)
          res
        else if (skipped.isEmpty)
          -1
        else {
          val refill = getRefill(0, 0, target - fuel, skipped)
          refill.fold(-1) { case (_, s) =>
            res + s
          }
        }
      } else {
        if (fuel >= stations(i)(0)) {
          skipped.enqueue(stations(i)(1))
          go(skipped, i + 1, fuel, res)
        } else if (skipped.isEmpty)
          -1
        else {
          getRefill(0, 0, stations(i)(0) - fuel, skipped) match {
            case Some((r, s)) =>
              skipped.enqueue(stations(i)(1))
              go(skipped, i + 1, fuel + r, res + s)
            case None => -1
          }
        }
      }
    }

    val heap = mutable.PriorityQueue.empty[Int]
    go(heap, 0, startFuel, 0)
  }
}
