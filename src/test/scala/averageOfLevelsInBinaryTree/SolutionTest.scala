package averageOfLevelsInBinaryTree

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [3.00000,14.50000,11.00000]" in {
    val root = new TreeNode(
      3,
      _left = new TreeNode(9),
      _right =
        new TreeNode(20, _left = new TreeNode(15), _right = new TreeNode(7))
    )
    val res = Array(3.00000, 14.50000, 11.0000)
    assert(Solution.averageOfLevels(root) sameElements res)
  }

  "example 2" should "return [3.00000,14.50000,11.00000]" in {
    val root = new TreeNode(
      3,
      _left =
        new TreeNode(9, _left = new TreeNode(15), _right = new TreeNode(7)),
      _right = new TreeNode(20)
    )
    val res = Array(3.00000, 14.50000, 11.0000)
    assert(Solution.averageOfLevels(root) sameElements res)
  }
}
