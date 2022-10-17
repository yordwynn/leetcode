package rotateList

import leetcode.utils.ListNode

// 61. Rotate List
object Solution {
  def rotateRight(head: ListNode, k: Int): ListNode = {
    val lngth = ListNode.length(head)
    if (lngth == 0)
      head
    else {
      val rotate = k % lngth
      val pass = lngth - rotate

      if (rotate == 0)
        head
      else {
        var i = 1
        var p = head

        while (i < pass) {
          i = i + 1
          p = p.next
        }

        val newHead = p.next
        p.next = null
        var trail = newHead

        while (trail.next != null)
          trail = trail.next

        trail.next = head
        newHead
      }
    }
  }
}
