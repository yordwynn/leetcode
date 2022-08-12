package flattenBinaryTreeToLinkedList

import tree.TreeNode

import scala.annotation.tailrec

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

object Solution2 {
  def flatten(root: TreeNode): Unit = {
    def prependIfExists(node: TreeNode, stack: Seq[TreeNode]): Seq[TreeNode] =
      if (node == null) stack else node +: stack

    @tailrec
    def go(stack: Seq[TreeNode]): Unit = {
      if (stack.isEmpty)
        ()
      else {
        val node = stack.head
        val newStack =
          prependIfExists(node.left, prependIfExists(node.right, stack.tail))
        node.right = if (newStack.isEmpty) null else newStack.head
        node.left = null
        go(newStack)
      }
    }

    if (root != null) go(Seq(root)) else ()
  }
}
