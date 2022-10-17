package topKFrequentElements

// 347. Top K Frequent Elements
object Solution {
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
