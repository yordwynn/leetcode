package removeDuplicatesFromSortedList2

import leetcode.utils.ListNode

// 82. Remove Duplicates from Sorted List II
object Solution {
  def deleteDuplicates(head: ListNode): ListNode = {
    val res = new ListNode(-1)
    var resCur = res
    var repeated = Int.MinValue
    var cur = head

    while (cur != null) {
      if (cur.next != null) {
        if (cur.x != repeated && cur.x != cur.next.x) {
          resCur.next = new ListNode(cur.x)
          resCur = resCur.next
        } else {
          repeated = cur.x
        }
      } else {
        if (cur.x != repeated)
          resCur.next = new ListNode(cur.x)
      }
      cur = cur.next
    }

    res.next
  }
}
