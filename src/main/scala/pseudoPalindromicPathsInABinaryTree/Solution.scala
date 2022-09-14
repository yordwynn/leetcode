package pseudoPalindromicPathsInABinaryTree

import tree.TreeNode

// 1457. Pseudo-Palindromic Paths in a Binary Tree
object Solution {
  def pseudoPalindromicPaths(root: TreeNode): Int = {
    def isPalindrome(freq: Map[Int, Int]): Int = {
      val oddCount = freq.values.foldLeft(0)((acc, value) =>
        if (value % 2 == 1) acc + 1 else acc
      )
      if (oddCount <= 1) 1 else 0
    }

    def go(node: TreeNode, freq: Map[Int, Int]): Int = {
      if (node == null)
        0
      else {
        val newFreq =
          freq.updated(node.value, freq.getOrElse(node.value, 0) + 1)
        if (node.left == null && node.right == null)
          isPalindrome(newFreq)
        else
          go(node.left, newFreq) + go(node.right, newFreq)
      }
    }

    go(root, Map.empty)
  }
}
