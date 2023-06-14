package minimumAbsoluteDifferenceInBst

import tree.TreeNode

// 530. Minimum Absolute Difference in BST
object Solution {
  def getMinimumDifference(root: TreeNode): Int = {
    var prev = Int.MaxValue

    def inOrder(root: TreeNode, res: Int): Int = {
      if (root == null)
        res
      else {
        val leftMin = inOrder(root.left, res)
        println(s"${root.value} - $prev = ${(root.value - prev).abs}")
        val min = leftMin.min((root.value - prev).abs)
        prev = root.value
        inOrder(root.right, min)
      }
    }

    inOrder(root, Int.MaxValue)
  }
}
