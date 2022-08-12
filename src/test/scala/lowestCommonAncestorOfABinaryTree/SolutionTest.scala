package lowestCommonAncestorOfABinaryTree

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
  "example 1" should "return 5" in {
    val p = root.left
    val q = root.right
    val res = root
    assert(Solution.lowestCommonAncestor(root, p, q) == res)
  }
}
