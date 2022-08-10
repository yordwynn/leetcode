package convertSortedArrayToBinarySearchTree

import example.TreeNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [0,-10,5,null,-3,null,9]" in {
    val nums = Array(-10, -3, 0, 5, 9)
    val res = {
      new TreeNode(
        0,
        new TreeNode(-10, _right = new TreeNode(-3)),
        new TreeNode(5, _right = new TreeNode(9))
      )
    }
    assert(Solution.sortedArrayToBST(nums) == res)
  }

  "example 2" should "return [1,3]" in {
    val nums = Array(1, 3)
    val res = new TreeNode(1, _right = new TreeNode(3))
    assert(Solution.sortedArrayToBST(nums) == res)
  }
}
