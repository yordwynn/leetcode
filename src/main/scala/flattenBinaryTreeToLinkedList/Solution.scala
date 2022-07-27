package flattenBinaryTreeToLinkedList

import example.TreeNode

import scala.annotation.tailrec

object Solution {
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
