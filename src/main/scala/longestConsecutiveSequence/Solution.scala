package longestConsecutiveSequence

import scala.annotation.tailrec
import scala.collection.immutable.HashSet

// 128. Longest Consecutive Sequence
object Solution {
  def longestConsecutive(nums: Array[Int]): Int = {
    val hashed = HashSet.from(nums)

    @tailrec
    def go(curLong: Int, i: Int, lng: Int): Int = {
      if (hashed.contains(i)) go(curLong, i + 1, lng + 1) else curLong.max(lng)
    }

    nums.foldLeft(0)((length, item) =>
      if (hashed.contains(item - 1))
        length
      else
        go(length, item + 1, 1)
    )
  }
}
