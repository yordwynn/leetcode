package findOriginalArrayFromDoubledArray

import scala.annotation.tailrec

object Solution {
  def findOriginalArray(changed: Array[Int]): Array[Int] = {
    val keys = changed.sorted
    val values = keys.foldLeft(Map.empty[Int, Int])((m, i) => {
      m.updated(i, m.getOrElse(i, 0) + 1)
    })

    @tailrec
    def go(i: Int, items: Map[Int, Int], res: Vector[Int]): Vector[Int] = {
      if (i >= keys.length)
        res
      else if (items(keys(i)) > 0) {
        val item = keys(i)
        val newItems = items.updated(item, items(item) - 1)
        if (newItems.contains(item * 2) && newItems(item * 2) > 0) {
          go(
            i + 1,
            newItems.updated(item * 2, newItems(item * 2) - 1),
            res.appended(item)
          )
        } else {
          Vector.empty
        }
      } else {
        go(i + 1, items, res)
      }
    }

    go(0, values, Vector.empty).toArray
  }
}
