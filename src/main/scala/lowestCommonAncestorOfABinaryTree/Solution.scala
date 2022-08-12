package lowestCommonAncestorOfABinaryTree

import tree.TreeNode

// 236. Lowest Common Ancestor of a Binary Tree
object Solution {
  def lowestCommonAncestor(
      root: TreeNode,
      p: TreeNode,
      q: TreeNode
  ): TreeNode = {
    def findNode(
        node: TreeNode,
        target: TreeNode,
        res: Seq[TreeNode]
    ): (Boolean, Seq[TreeNode]) = {
      if (node == null)
        (false, res)
      else if (node.value == target.value)
        (true, node +: res)
      else {
        val inLeft = findNode(node.left, target, node +: res)
        if (inLeft._1)
          inLeft
        else
          findNode(node.right, target, node +: res)
      }
    }

    val pPath = findNode(root, p, Nil)._2.reverse
    val qPath = findNode(root, q, Nil)._2.reverse

    pPath.zip(qPath).findLast(x => x._1 == x._2).get._1
  }
}
