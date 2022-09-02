package averageOfLevelsInBinaryTree

import tree.TreeNode

import scala.annotation.tailrec

// 637. Average of Levels in Binary Tree
object Solution {
  def averageOfLevels(root: TreeNode): Array[Double] = {
    @tailrec
    def go(nodes: Seq[TreeNode], avgs: Vector[Double]): Vector[Double] = {
      if (nodes.isEmpty)
        avgs
      else {
        val avg = nodes.map(_.value.toDouble).sum / nodes.length
        val newLevel =
          nodes.flatMap(n => Seq(n.left, n.right)).filter(_ != null)
        go(newLevel, avgs :+ avg)
      }
    }
    go(Seq(root), Vector.empty).toArray
  }
}
