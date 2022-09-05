package nAryTreeLevelOrderTraversal

import node.Node

import scala.annotation.tailrec

// 429. N-ary Tree Level Order Traversal
object Solution {
  def levelOrder(root: Node): List[List[Int]] = {

    @tailrec
    def go(nodes: List[Node], res: Vector[List[Int]]): Vector[List[Int]] = {
      if (nodes.isEmpty)
        res
      else {
        val levelValues = nodes.map(_.value)
        val nextNodes = nodes.flatMap(_.children)
        go(nextNodes, res :+ levelValues)
      }
    }

    go(List(root).filter(_ != null), Vector.empty).toList
  }
}
