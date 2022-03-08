package example

import scala.annotation.tailrec

object ListNode {
  def main(args: Array[String]): Unit = {
    val node3 = new ListNode(3)
    val node2 = new ListNode(2)
    val node0 = new ListNode(0)
    val node_4 = new ListNode(-4)
    node3.next = node2
    node2.next = node0
    node0.next = node_4
    node_4.next = node2
    val res = hasCycle(node3)
    print(res)
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

  def hasCycle(head: ListNode): Boolean = {
    var res = false
    var t = head
    var h = head

    while (h != null && !res) {
      t = t.next
      h = h.next
      if (h != null) {
        h = h.next
        res = t.eq(h)
      }
    }

    res
  }
}

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}
