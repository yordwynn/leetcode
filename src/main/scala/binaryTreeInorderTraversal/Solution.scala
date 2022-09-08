package binaryTreeInorderTraversal

import tree.TreeNode

// 94. Binary Tree Inorder Traversal
object Solution {
  def inorderTraversal(root: TreeNode): List[Int] = {
    def go(node: TreeNode, res: Vector[Int]): Vector[Int] = {
      if (node == null)
        res
      else {
        val leftSubtree = go(node.left, res)
        go(node.right, leftSubtree.appended(node.value))
      }
    }
    go(root, Vector.empty).toList
  }
}
