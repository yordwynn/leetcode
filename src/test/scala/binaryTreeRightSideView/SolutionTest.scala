package binaryTreeRightSideView

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,3,4]" in {
    val root = new TreeNode(
      1,
      new TreeNode(2, _right = new TreeNode(5)),
      new TreeNode(3, _right = new TreeNode(4))
    )
    assert(Solution.rightSideView2(root) == List(1, 3, 4))
  }

  "example 2" should "return [1,3]" in {
    val root = new TreeNode(
      1,
      _right = new TreeNode(3)
    )
    assert(Solution.rightSideView(root) == List(1, 3))
  }

  "example 3" should "return []" in {
    val root = null
    assert(Solution.rightSideView(root) == Nil)
  }
}
