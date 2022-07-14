package constructBinaryTreeFromPreorderAndInorderTraversal

import example.TreeNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [3,9,20,null,null,15,7]" in {
    val preorder = Array(3, 9, 20, 15, 7)
    val inorder = Array(9, 3, 15, 20, 7)
    assert(
      Solution.buildTree(preorder, inorder) == new TreeNode(
        3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7))
      )
    )
  }

  "example 2" should "return [-1]" in {
    val preorder = Array(-1)
    val inorder = Array(-1)
    assert(
      Solution.buildTree(preorder, inorder) == new TreeNode(-1)
    )
  }

  "example 3" should "return [1,2,null]" in {
    val preorder = Array(1, 2)
    val inorder = Array(2, 1)
    assert(
      Solution.buildTree(preorder, inorder) == new TreeNode(
        1,
        _left = new TreeNode(2)
      )
    )
  }

  "example 4" should "return [3,1,4,null,2]" in {
    val preorder = Array(3, 1, 2, 4)
    val inorder = Array(1, 2, 3, 4)
    assert(
      Solution.buildTree(preorder, inorder) == new TreeNode(
        3,
        _left = new TreeNode(1, _right = new TreeNode(2)),
        _right = new TreeNode(4)
      )
    )
  }

  "example 5" should "return [1,null, 2]" in {
    val preorder = Array(1, 2)
    val inorder = Array(1, 2)
    assert(
      Solution.buildTree(preorder, inorder) == new TreeNode(
        1,
        _right = new TreeNode(2)
      )
    )
  }
}
