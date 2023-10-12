package binaryTreeLevelOrderTraversal

import tree.TreeNode

import scala.annotation.tailrec
import scala.collection.immutable.Queue

// 102. Binary Tree Level Order Traversal
object Solution {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    @tailrec
    def go2(
        nodes: Vector[TreeNode],
        res: List[List[Int]] = List()
    ): List[List[Int]] = {
      if (nodes.isEmpty)
        res
      else {
        val nextLevelNodes = for {
          node <- nodes
          nextNodes <- Vector(node.left, node.right).filter(_ != null)
        } yield nextNodes
        val currentNodes = nodes.map(_.value).toList
        go2(nextLevelNodes, res.appended(currentNodes))
      }
    }

    go2(Vector(root).filter(_ != null))
  }
}
