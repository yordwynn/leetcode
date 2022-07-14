package binaryTreeLevelOrderTraversal

import example.TreeNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[3],[9,20],[15,7]]" in {
    val root = new TreeNode(
      3,
      new TreeNode(9),
      new TreeNode(20, new TreeNode(15), new TreeNode(7))
    )
    assert(
      Solution.levelOrder(root) == List(List(3), List(9, 20), List(15, 7))
    )
  }

  "example 2" should "return [[1]]" in {
    val root = new TreeNode(1)

    assert(
      Solution.levelOrder(root) == List(List(1))
    )
  }

  "example 3" should "return []" in {
    val root = null

    assert(
      Solution.levelOrder(root) == Nil
    )
  }
}
