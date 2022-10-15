package lowestCommonAncestorOfABinarySearchTree

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  val root = new TreeNode(
    6,
    new TreeNode(
      2,
      new TreeNode(0),
      new TreeNode(4, new TreeNode(3), new TreeNode(5))
    ),
    new TreeNode(8, new TreeNode(7), new TreeNode(9))
  )

  "example 1" should "return 2" in {
    val p = new TreeNode(2)
    val q = new TreeNode(4)

    assert(Solution.lowestCommonAncestor(root, p, q).value == 2)
  }

  "example 2" should "return 6" in {
    val p = new TreeNode(2)
    val q = new TreeNode(8)

    assert(Solution.lowestCommonAncestor(root, p, q).value == 6)
  }

  "example 3" should "return 2" in {
    val root = new TreeNode(2, _left = new TreeNode(1))
    val p = new TreeNode(2)
    val q = new TreeNode(1)

    assert(Solution.lowestCommonAncestor(root, p, q).value == 2)
  }
}
