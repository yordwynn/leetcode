package pseudoPalindromicPathsInABinaryTree

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 2" in {
    val root = new TreeNode(
      2,
      _left = new TreeNode(
        3,
        _left = new TreeNode(3),
        _right = new TreeNode(1)
      ),
      _right = new TreeNode(
        1,
        _right = new TreeNode(1)
      )
    )
    assert(Solution.pseudoPalindromicPaths(root) == 2)
  }

  "example 2" should "return 1" in {
    val root = new TreeNode(
      2,
      _left = new TreeNode(
        1,
        _left = new TreeNode(1),
        _right = new TreeNode(
          3,
          _right = new TreeNode(1)
        )
      ),
      _right = new TreeNode(1)
    )
    assert(Solution.pseudoPalindromicPaths(root) == 1)
  }
}
