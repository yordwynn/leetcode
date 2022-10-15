package reverseLinkedList2

import example.ListNode

import scala.annotation.tailrec

object Solution {
  def reverseBetween(head: ListNode, left: Int, right: Int): ListNode = {
    @tailrec
    def findStart(head: ListNode, i: Int = 1): ListNode = {
      if (i == left)
        head
      else findStart(head.next, i + 1)
    }

    def reverse(start: ListNode) = ???

    ???
  }
}
