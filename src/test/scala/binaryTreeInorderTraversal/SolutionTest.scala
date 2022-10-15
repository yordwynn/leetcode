package binaryTreeInorderTraversal

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,3,2]" in {
    val root =
      new TreeNode(1, _right = new TreeNode(2, _left = new TreeNode(3)))
    val res = List(1, 3, 2)
    assert(Solution.inorderTraversal(root) == res)
  }

  "example 2" should "return []" in {
    val root = null
    val res = List.empty
    assert(Solution.inorderTraversal(root) == res)
  }

  "example 3" should "return [1]" in {
    val root = new TreeNode(1)
    val res = List(1)
    assert(Solution.inorderTraversal(root) == res)
  }
}
