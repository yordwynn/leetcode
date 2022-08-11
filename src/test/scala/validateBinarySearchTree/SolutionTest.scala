package validateBinarySearchTree

import example.TreeNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val root = new TreeNode(2, new TreeNode(1), new TreeNode(3))
    assert(Solution.isValidBST(root))
  }

  "example 2" should "return false" in {
    val root = new TreeNode(
      5,
      new TreeNode(1),
      new TreeNode(4, new TreeNode(3), new TreeNode(6))
    )
    assert(!Solution.isValidBST(root))
  }

  "example 3" should "return false" in {
    val root = new TreeNode(
      5,
      new TreeNode(4),
      new TreeNode(6, new TreeNode(3), new TreeNode(7))
    )
    assert(!Solution.isValidBST(root))
  }
}
