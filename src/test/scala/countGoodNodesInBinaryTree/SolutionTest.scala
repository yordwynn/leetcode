package countGoodNodesInBinaryTree

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 4" in {
    val root = new TreeNode(
      3,
      _left = new TreeNode(1, _left = new TreeNode(3)),
      _right =
        new TreeNode(4, _left = new TreeNode(1), _right = new TreeNode(5))
    )

    assert(Solution.goodNodes(root) == 4)
  }

  "example 2" should "return 3" in {
    val root = new TreeNode(
      3,
      _left = new TreeNode(3, _left = new TreeNode(4), _right = new TreeNode(2))
    )

    assert(Solution.goodNodes(root) == 3)
  }

  "example 3" should "return 1" in {
    val root = new TreeNode(1)

    assert(Solution.goodNodes(root) == 1)
  }
}
