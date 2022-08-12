package convertSortedArrayToBinarySearchTree

import tree.TreeNode

// 108. Convert Sorted Array to Binary Search Tree
object Solution {
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    def go(left: Int, right: Int): TreeNode = {
      if (left > right)
        null
      else {
        val mid = (right + left) / 2
        new TreeNode(
          nums(mid),
          _left = go(left, mid - 1),
          _right = go(mid + 1, right)
        )
      }
    }
    go(0, nums.length - 1)
  }
}
