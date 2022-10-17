package partitionList

import leetcode.utils.ListNode

import scala.annotation.tailrec

// 86. Partition List
object Solution {
  def partition(head: ListNode, x: Int): ListNode = {
    val lHead = new ListNode()
    val rHead = new ListNode()

    @tailrec
    def go(
        current: ListNode,
        left: ListNode = lHead,
        right: ListNode = rHead
    ): ListNode = {
      if (current == null) {
        if (lHead.next != null) {
          left.next = rHead.next
          right.next = null
          lHead.next
        } else {
          right.next = null
          rHead.next
        }
      } else if (current.x < x) {
        left.next = current
        go(current.next, left.next, right)
      } else {
        right.next = current
        go(current.next, left, right.next)
      }
    }

    go(head)
  }
}
