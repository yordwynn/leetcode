package searchInABinarySearchTree

import tree.TreeNode

import scala.annotation.tailrec

// 700. Search in a Binary Search Tree
object Solution {
  @tailrec
  def searchBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root == null)
      root
    else if (root.value == `val`)
      root
    else if (root.value > `val`)
      searchBST(root.left, `val`)
    else
      searchBST(root.right, `val`)
  }
}
