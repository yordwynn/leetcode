package linkedListCycle

import leetcode.utils.ListNode

// 141. Linked List Cycle
object Solution {
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
