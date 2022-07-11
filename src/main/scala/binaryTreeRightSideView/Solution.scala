package binaryTreeRightSideView

import example.TreeNode

import scala.annotation.tailrec
import scala.collection.immutable.Queue

object Solution {
  def rightSideView(root: TreeNode): List[Int] = {
    @tailrec
    def go(nodes: Queue[(Int, TreeNode)], res: List[Int] = Nil): List[Int] = {
      if (nodes.isEmpty)
        res
      else
        nodes.dequeue match {
          case ((_, null), decNodes) => go(decNodes, res)
          case ((level, node), decNodes) =>
            val newNodes = decNodes
              .enqueue((level + 1, node.right))
              .enqueue((level + 1, node.left))
            if (level == res.size)
              go(newNodes, res.appended(node.value))
            else
              go(newNodes, res)
        }
    }

    go(Queue(0 -> root))
  }

  def rightSideView2(root: TreeNode): List[Int] = {
    def go(
        node: TreeNode,
        level: Int = 0,
        res: List[Int] = Nil
    ): List[Int] = {
      if (node == null)
        res
      else if (level == res.size) {
        val rRes = go(node.right, level + 1, res.appended(node.value))
        go(node.left, level + 1, rRes)
      } else {
        val rRes = go(node.right, level + 1, res)
        go(node.left, level + 1, rRes)
      }
    }

    go(root)
  }
}
