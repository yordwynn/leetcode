package example

import scala.collection.mutable

object KthLargest {
  def main(args: Array[String]): Unit = {
    val h = new KthLargest(3, Array(4, 5, 8, 2))

    println(h.add(3))
    println(h.add(5))
    println(h.add(10))
    println(h.add(9))
    println(h.add(4))
  }
}

class KthLargest(_k: Int, _nums: Array[Int]) {
  val heap: mutable.PriorityQueue[Int] = {
    val h = scala.collection.mutable.PriorityQueue
      .newBuilder(Ordering.Int.reverse)
      .result()

    h.enqueue(_nums: _*)

    while (h.size > _k)
      h.dequeue()

    h
  }

  def add(`val`: Int): Int = {
    heap.enqueue(`val`)
    if (heap.size > _k)
      heap.dequeue()

    heap.head
  }
}
