package minimumAbsoluteDifferenceInBst

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 1" in {
    val root =
      new TreeNode(
        4,
        _left = new TreeNode(2, _left = new TreeNode(1), _right = new TreeNode(3)),
        _right = new TreeNode(6))
    val res = 1
    assert(Solution.getMinimumDifference(root) == res)
  }

  "example 2" should "return 519" in {
    val root =
      new TreeNode(
        0,
        _right = new TreeNode(
          2236,
          _left = new TreeNode(1277, _left = new TreeNode(519)),
          _right = new TreeNode(776)))
    val res = 519
    assert(Solution.getMinimumDifference(root) == res)
  }
}
