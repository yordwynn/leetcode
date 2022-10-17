package lastStoneWeight

// 1046. Last Stone Weight
object Solution {
  def lastStoneWeight(stones: Array[Int]): Int = {
    val weights = scala.collection.mutable.PriorityQueue[Int]()
    weights.enqueue(stones: _*)

    while (weights.size > 1) {
      val y = weights.dequeue
      val x = weights.dequeue
      if (x != y)
        weights.enqueue(y - x)
    }

    if (weights.nonEmpty) weights.dequeue else 0
  }
}
