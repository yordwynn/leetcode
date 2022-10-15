package lowestCommonAncestorOfABinarySearchTree

import org.scalatest.flatspec.AnyFlatSpec
import tree.TreeNode

class SolutionTest extends AnyFlatSpec {
  val root = new TreeNode(
    3,
    new TreeNode(
      5,
      new TreeNode(6),
      new TreeNode(2, new TreeNode(7), new TreeNode(4))
    ),
    new TreeNode(1, new TreeNode(0), new TreeNode(8))
  )

  "example 1" should "return 3" in {
    val p = new TreeNode(5)
    val q = new TreeNode(1)

    assert(Solution.lowestCommonAncestor(root, p, q).value == 3)
  }

  "example 2" should "return 5" in {
    val p = new TreeNode(5)
    val q = new TreeNode(4)

    assert(Solution.lowestCommonAncestor(root, p, q).value == 5)
  }

  "example 3" should "return 1" in {
    val root = new TreeNode(1, _left = new TreeNode(2))
    val p = new TreeNode(1)
    val q = new TreeNode(2)

    assert(Solution.lowestCommonAncestor(root, p, q).value == 1)
  }
}
