package constructBinaryTreeFromPreorderAndInorderTraversal

import tree.TreeNode

import scala.collection.immutable.HashMap

object Solution {
  def buildTree(preorder: Array[Int], inorder: Array[Int]): TreeNode = {
    val inorderMap = HashMap.from(inorder.zipWithIndex)

    def go(
        preorderI: Int,
        inorderLeft: Int,
        inorderRight: Int
    ): (TreeNode, Int) = {
      if (inorderLeft == inorderRight)
        (new TreeNode(preorder(preorderI)), preorderI + 1)
      else if (inorderLeft > inorderRight || preorderI >= preorder.length)
        (null, preorderI)
      else {
        val rootValue = preorder(preorderI)
        val inorderI = inorderMap(rootValue)
        val (left, i) = go(preorderI + 1, inorderLeft, inorderI - 1)
        val (right, j) =
          if (left == null) go(i, inorderI + 1, inorderRight)
          else go(i, inorderI + 1, inorderRight)
        (new TreeNode(rootValue, left, right), j)
      }
    }

    go(0, 0, preorder.length - 1)._1
  }
}
