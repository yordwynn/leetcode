package swappingNodesInALinkedList

import leetcode.utils.ListNode

// 1721. Swapping Nodes in a Linked List
object Solution {
  def swapNodes(head: ListNode, k: Int): ListNode = {
    var a = head
    var i = 1

    while (i < k) {
      a = a.next
      i = i + 1
    }

    var b = head
    var t = a

    while (t.next != null) {
      b = b.next
      t = t.next
    }

    val buf = a.x
    a.x = b.x
    b.x = buf

    head
  }
}
