package minimumNumberOfOperationsToMakeArrayContinuous

import scala.annotation.tailrec
import scala.collection.immutable.SortedSet

// 2009. Minimum Number of Operations to Make Array Continuous
object Solution {
  def minOperations(nums: Array[Int]): Int = {
    val sortedNums = SortedSet(nums: _*).toArray

    @tailrec
    def binSearch(l: Int, r: Int, target: Int): Int = {
      if (l > r)
        l
      else {
        val m = (l + r) / 2
        if (sortedNums(m) <= target)
          binSearch(m + 1, r, target)
        else
          binSearch(l, m - 1, target)
      }
    }

    sortedNums.indices.foldLeft(Int.MaxValue) { (minOps, i) =>
      val left = sortedNums(i)
      val right = left + nums.length - 1

      val j = binSearch(0, sortedNums.length - 1, right)
      minOps.min(nums.length - j + i)
    }
  }
}
