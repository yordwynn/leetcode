package binaryTreesWithFactors

import scala.annotation.tailrec

// 823. Binary Trees With Factors
object Solution {
  def numFactoredBinaryTrees(arr: Array[Int]): Int = {
    val mod = 1000000007
    arr.sortInPlace()

    @tailrec
    def go(dp: Map[Int, Int], root: Int, i: Int = 0): Map[Int, Int] = {
      if (arr(i) >= root)
        dp
      else if (root % arr(i) != 0)
        go(dp, root, i + 1)
      else {
        val left = dp(arr(i))
        val right = dp.getOrElse(root / arr(i), 0)
        go(
          dp.updated(
            root,
            ((dp(root) + ((left.toLong * right) % mod)) % mod).toInt
          ),
          root,
          i + 1
        )
      }
    }

    val dp = Map.from(arr.zip(Array.fill(arr.length)(1)))
    val resDp = arr.foldLeft(dp)((dp, item) => { go(dp, item) })
    resDp.values.foldLeft(0)((sum, item) => (sum + item) % mod)
  }
}
