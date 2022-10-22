package containsDuplicate2

import scala.annotation.tailrec

// 219. Contains Duplicate II
object Solution {
  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
    @tailrec
    def go(i: Int, counts: Map[Int, Int]): Boolean = {
      if (i >= nums.length)
        false
      else if (counts.contains(nums(i)) && i - counts(nums(i)) <= k)
        true
      else
        go(i + 1, counts.updated(nums(i), i))
    }

    go(0, Map.empty[Int, Int])
  }
}
