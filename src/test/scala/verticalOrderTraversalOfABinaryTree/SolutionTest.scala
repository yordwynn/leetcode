package verticalOrderTraversalOfABinaryTree

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[9],[3,15],[20],[7]]" in {
    val root = new TreeNode(
      3,
      _left = new TreeNode(9),
      _right = new TreeNode(
        20,
        _left = new TreeNode(15),
        _right = new TreeNode(7)
      )
    )
    val res = List(List(9), List(3, 15), List(20), List(7))
    assert(Solution.verticalTraversal(root) == res)
  }

  "example 2" should "return [[4],[2],[1,5,6],[3],[7]]" in {
    val root = new TreeNode(
      1,
      _left = new TreeNode(
        2,
        _left = new TreeNode(4),
        _right = new TreeNode(5)
      ),
      _right = new TreeNode(
        3,
        _left = new TreeNode(6),
        _right = new TreeNode(7)
      )
    )
    val res = List(List(4), List(2), List(1, 5, 6), List(3), List(7))
    assert(Solution.verticalTraversal(root) == res)
  }

  "example 3" should "return [[4],[2],[1,5,6],[3],[7]]" in {
    val root = new TreeNode(
      1,
      _left = new TreeNode(
        2,
        _left = new TreeNode(4),
        _right = new TreeNode(6)
      ),
      _right = new TreeNode(
        3,
        _left = new TreeNode(5),
        _right = new TreeNode(7)
      )
    )
    val res = List(List(4), List(2), List(1, 5, 6), List(3), List(7))
    assert(Solution.verticalTraversal(root) == res)
  }
}
