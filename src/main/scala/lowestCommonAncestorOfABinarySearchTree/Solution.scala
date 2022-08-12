package lowestCommonAncestorOfABinarySearchTree

import tree.TreeNode

import scala.annotation.tailrec

// 235. Lowest Common Ancestor of a Binary Search Tree
object Solution {
  @tailrec
  def lowestCommonAncestor(
      root: TreeNode,
      p: TreeNode,
      q: TreeNode
  ): TreeNode = {
    if (root.value > p.value && root.value > q.value)
      lowestCommonAncestor(root.left, p, q)
    else if (root.value < p.value && root.value < q.value)
      lowestCommonAncestor(root.right, p, q)
    else
      root
  }
}
