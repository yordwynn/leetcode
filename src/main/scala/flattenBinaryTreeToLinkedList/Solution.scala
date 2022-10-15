package flattenBinaryTreeToLinkedList

import tree.TreeNode

import scala.annotation.tailrec

// 114. Flatten Binary Tree to Linked List
object Solution {
  def flatten(root: TreeNode): Unit = {
    def go(node: TreeNode, attach: TreeNode = null): TreeNode = {
      if (node == null)
        attach
      else {
        val lsub = go(node.right, attach)
        node.right = go(node.left, lsub)
        node.left = null
        node
      }
    }
    go(root)
  }
}
