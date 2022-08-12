package binaryTreeLevelOrderTraversal

import tree.TreeNode

import scala.annotation.tailrec
import scala.collection.immutable.Queue

object Solution {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    @tailrec
    def go(
        nodes: Queue[(TreeNode, Int)],
        levelNodes: List[Int] = List(),
        res: List[List[Int]] = List()
    ): List[List[Int]] = {
      if (nodes.isEmpty)
        res.appended(levelNodes)
      else {
        val (item, dequeued) = nodes.dequeue
        item match {
          case (node, level) =>
            val addRight =
              if (node.right != null) dequeued.enqueue((node.right, level + 1))
              else dequeued
            val addBoth =
              if (node.left != null) addRight.enqueue((node.left, level + 1))
              else addRight
            if (level > res.length)
              go(addBoth, List(node.value), res.appended(levelNodes))
            else
              go(addBoth, levelNodes.prepended(node.value), res)
        }
      }
    }

    if (root != null) go(Queue((root, 0))) else Nil
  }
}
