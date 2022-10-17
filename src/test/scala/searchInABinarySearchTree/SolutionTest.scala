package searchInABinarySearchTree

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  val root = new TreeNode(
    4,
    _left = new TreeNode(2, _left = new TreeNode(1), _right = new TreeNode(3)),
    _right = new TreeNode(7)
  )

  "example 1" should "return [2,3,1]" in {
    val `val` = 2
    val res = new TreeNode(2, _left = new TreeNode(1), _right = new TreeNode(3))
    assert(Solution.searchBST(root, `val`) == res)
  }

  "example 2" should "return []" in {
    val `val` = 5
    val res = null
    assert(Solution.searchBST(root, `val`) == res)
  }
}
