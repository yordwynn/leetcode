package validateBinarySearchTree

import example.TreeNode

// 98. Validate Binary Search Tree
object Solution {
  def isValidBST(root: TreeNode): Boolean = {
    def go(node: TreeNode, leftBound: Long, rightBound: Long): Boolean = {
      if (node == null)
        true
      else if (leftBound < node.value && node.value < rightBound)
        go(node.left, leftBound, node.value) && go(
          node.right,
          node.value,
          rightBound
        )
      else false
    }

    go(root, Long.MinValue, Long.MaxValue)
  }
}
