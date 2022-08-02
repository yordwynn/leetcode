package kthSmallestElementInASortedMatrix

import scala.annotation.tailrec
import scala.collection.mutable

// 378. Kth Smallest Element in a Sorted Matrix
object Solution {
  def kthSmallest(matrix: Array[Array[Int]], k: Int): Int = {
    val smallest = new mutable.PriorityQueue[Int]()
    val m = matrix.length
    val n = matrix(0).length
    @tailrec
    def go(i: Int, j: Int): Int =
      if (j == n)
        go(i + 1, 0)
      else if (i == m)
        smallest.dequeue()
      else {
        smallest.enqueue(matrix(i)(j))
        if (smallest.size > k) smallest.dequeue()
        go(i, j + 1)
      }

    go(0, 0)
  }
}
