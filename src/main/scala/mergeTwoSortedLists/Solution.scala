package mergeTwoSortedLists

import leetcode.utils.ListNode

import scala.annotation.tailrec

// 21. Merge Two Sorted Lists
object Solution {
  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {

    def go(l1: ListNode, l2: ListNode, h: ListNode, c: ListNode): ListNode = {
      if (l1 == null && l2 == null) {
        h
      } else if (l1 == null) {
        c.next = l2
        h
      } else if (l2 == null) {
        c.next = l1
        h
      } else if (l1.x <= l2.x) {
        c.next = l1
        go(l1.next, l2, h, c.next)
      } else {
        c.next = l2
        go(l1, l2.next, h, c.next)
      }
    }

    val res = new ListNode(-1)
    go(list1, list2, res, res).next
  }
}
