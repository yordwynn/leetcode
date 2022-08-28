package sortTheMatrixDiagonally

import scala.annotation.tailrec
import scala.collection.mutable

// 1329. Sort the Matrix Diagonally
object Solution {
  def diagonalSort(mat: Array[Array[Int]]): Array[Array[Int]] = {
    val m = mat.length
    val n = mat(0).length
    val heap = mutable.PriorityQueue.newBuilder(Ordering.Int.reverse).result()

    def sort(i: Int, j: Int): Unit = {
      fillHeap(i, j)
      fillMat(i, j)
    }

    @tailrec
    def fillHeap(i: Int, j: Int): Unit = {
      if (i >= m || j >= n) ()
      else {
        heap.enqueue(mat(i)(j))
        fillHeap(i + 1, j + 1)
      }
    }

    @tailrec
    def fillMat(i: Int, j: Int): Unit = {
      if (heap.isEmpty) ()
      else {
        mat(i)(j) = heap.dequeue()
        fillMat(i + 1, j + 1)
      }
    }

    for (i <- m - 1 to (0, -1))
      sort(i, 0)

    for (j <- 1 until n)
      sort(0, j)

    mat
  }
}
