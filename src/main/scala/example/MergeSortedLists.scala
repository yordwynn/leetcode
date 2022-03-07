package example

import scala.annotation.tailrec

object MergeSortedLists {
  def main(args: Array[String]): Unit = {
    val l1 = new ListNode(1, new ListNode(2, new ListNode(4)))
    val l2 = new ListNode(1, new ListNode(3, new ListNode(4)))
    val x = mergeTwoLists(l1, l2)
    print(x)
  }

  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    @tailrec
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
    go(list1.next, list2, res, res).next
  }
}

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}
