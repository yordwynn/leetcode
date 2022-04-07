package example

object LastStoneWeight {
  def main(args: Array[String]): Unit = {
    val x = Array(1)

    println(lastStoneWeight(x))
  }

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
