package setMismatch

// 645. Set Mismatch
object Solution {
  def findErrorNums(nums: Array[Int]): Array[Int] = {
    val counts = nums.foldLeft(Map.empty[Int, Int])((acc, item) =>
      acc.updated(item, acc.getOrElse(item, 0) + 1)
    )
    val res = Array.fill(2)(0)

    (1 to nums.length).foreach { key =>
      counts.get(key) match {
        case None    => res(1) = key
        case Some(1) => ()
        case _       => res(0) = key
      }
    }

    res
  }
}
