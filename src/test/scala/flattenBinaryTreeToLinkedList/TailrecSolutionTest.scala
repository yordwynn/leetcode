package flattenBinaryTreeToLinkedList

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class TailrecSolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,null,2,null,3,null,4,null,5,null,6]" in {
    val root = new TreeNode(
      1,
      new TreeNode(2, new TreeNode(3), new TreeNode(4)),
      new TreeNode(5, _right = new TreeNode(6))
    )

    val res = new TreeNode(
      1,
      _right = new TreeNode(
        2,
        _right = new TreeNode(
          3,
          _right =
            new TreeNode(4, _right = new TreeNode(5, _right = new TreeNode(6)))
        )
      )
    )

    TailrecSolution.flatten(root)
    assert(root == res)
  }

  "example 2" should "return []" in {
    val root = null
    val res = null

    TailrecSolution.flatten(root)
    assert(root == res)
  }

  "example 3" should "return [0]" in {
    val root = new TreeNode(0)
    val res = new TreeNode(0)

    TailrecSolution.flatten(root)
    assert(root == res)
  }
}
