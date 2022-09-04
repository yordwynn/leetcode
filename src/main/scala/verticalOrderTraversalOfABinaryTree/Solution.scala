package verticalOrderTraversalOfABinaryTree

import tree.TreeNode

// 987. Vertical Order Traversal of a Binary Tree
object Solution {
  def verticalTraversal(root: TreeNode): List[List[Int]] = {
    def go(
        node: TreeNode,
        column: Int,
        row: Int,
        res: Map[Int, Map[Int, Vector[Int]]]
    ): Map[Int, Map[Int, Vector[Int]]] = {
      if (node == null)
        res
      else {
        val leftNodes = go(node.left, column - 1, row + 1, res)
        val mid = {
          val col = leftNodes.getOrElse(column, Map.empty)
          val colValues =
            col.updated(row, col.getOrElse(row, Vector.empty) :+ node.value)
          leftNodes.updated(column, colValues)
        }
        go(node.right, column + 1, row + 1, mid)
      }
    }

    val res = go(root, 0, 0, Map.empty)
    res.toList
      .sorted(Ordering.by[(Int, Map[Int, Vector[Int]]), Int](x => x._1))
      .map { case (_, values) =>
        values.toList
          .sorted(Ordering.by[(Int, Vector[Int]), Int](x => x._1))
          .flatMap(_._2.sorted.toList)
      }
  }
}
