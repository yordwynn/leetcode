package maximumLevelSumOfABinaryTree

import tree.TreeNode

import scala.annotation.tailrec

// 1161. Maximum Level Sum of a Binary Tree
object Solution {
  def maxLevelSum(root: TreeNode): Int = {
    @tailrec
    def go(nodes: Vector[TreeNode], currentLevel: Int, maxLevel: Int, maxSum: Int): Int =
      if (nodes.isEmpty)
        maxLevel
      else {
        val sum = nodes.map(_.value).sum
        val nextLevel = nodes.flatMap(n => Vector(n.left, n.right).filter(_ != null))
        if (sum > maxSum)
          go(nextLevel, currentLevel + 1, currentLevel, sum)
        else
          go(nextLevel, currentLevel + 1, maxLevel, maxSum)
      }

    go(Vector(root.left, root.right).filter(_ != null), 2, 1, root.value)
  }
}
