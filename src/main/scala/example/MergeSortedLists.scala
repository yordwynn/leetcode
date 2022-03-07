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
    def go(l1: ListNode, l2: ListNode, h: ListNode): Unit = {
      if (l1 == null && l2 == null) {
        ()
      } else if (l1 == null) {
        h.next = l2
      } else if (l2 == null) {
        h.next = l1
      } else if (l1.x <= l2.x) {
        h.next = l1
        go(l1.next, l2, h.next)
      } else {
        h.next = l2
        go(l1, l2.next, h.next)
      }
    }

    val res = new ListNode(-1)
    res.next
  }
}

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}
