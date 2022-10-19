package topKFrequentWords

import scala.collection.mutable

// 692. Top K Frequent Words
object Solution {
  def topKFrequent(words: Array[String], k: Int): List[String] = {
    val counts = words.groupMapReduce(identity)(_ => 1)((i, j) => i + j)
    val mostFrequent =
      mutable.PriorityQueue.empty[(String, Int)]((x, y) => {
        if (x._2 == y._2) x._1 compare y._1 else y._2 compare x._2
      })
    counts.foreach(item => {
      mostFrequent.enqueue(item)
      if (mostFrequent.size > k) mostFrequent.dequeue()
    })
    mostFrequent.take(k).dequeueAll.map[String](_._1).toList.reverse
  }
}
