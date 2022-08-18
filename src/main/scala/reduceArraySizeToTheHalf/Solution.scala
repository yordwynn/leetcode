package reduceArraySizeToTheHalf

import scala.annotation.tailrec
import scala.collection.mutable

// 1338. Reduce Array Size to The Half
object Solution {
  def minSetSize(arr: Array[Int]): Int = {
    val freq = arr.foldLeft(Map.empty[Int, Int])((map, item) => {
      val upd = map.getOrElse(item, 0)
      map.updated(item, upd + 1)
    })

    val heap = mutable.PriorityQueue.from(freq)(
      Ordering.by[(Int, Int), Int](item => item._2)
    )

    @tailrec
    def go(
        items: mutable.PriorityQueue[(Int, Int)],
        sum: Int = 0,
        res: Int = 0
    ): Int = {
      if (sum < arr.length / 2) {
        val (_, freq) = items.dequeue()
        go(items, sum + freq, res + 1)
      } else res
    }

    go(heap)
  }
}
