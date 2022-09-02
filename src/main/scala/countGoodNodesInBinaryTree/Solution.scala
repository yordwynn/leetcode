package countGoodNodesInBinaryTree

import tree.TreeNode

// 1448. Count Good Nodes in Binary Tree
object Solution {
  def goodNodes(root: TreeNode): Int = {
    def go(node: TreeNode, max: Int): Int = {
      if (node == null)
        0
      else if (node.value >= max) {
        1 + go(node.left, node.value) + go(node.right, node.value)
      } else {
        go(node.left, max) + go(node.right, max)
      }
    }

    go(root, root.value)
  }
}
