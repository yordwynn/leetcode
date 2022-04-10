package example

object TopKFrequent {
  def main(args: Array[String]): Unit = {
    val nums = Array(1, 1, 1, 2, 2, 3)
    val k = 2

    println(topKFrequent(nums, k).mkString(", "))
  }

  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    val frequencies = nums.foldLeft(Map.empty[Int, Int])((map, n) => {
      val cnt = map.getOrElse(n, 0)
      map.updated(n, cnt + 1)
    })

    val heap =
      scala.collection.mutable.PriorityQueue
        .newBuilder(Ordering.by[Int, Int](a => frequencies(a)).reverse)
        .result

    frequencies.foreach { case (key, _) =>
      heap.enqueue(key)
      if (heap.size > k)
        heap.dequeue
    }

    heap.dequeueAll.toArray
  }
}
