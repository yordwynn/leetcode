package addTwoNumbers

import leetcode.utils.ListNode

// 2. Add Two Numbers
object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    def getDigit(l: ListNode): Int = {
      if (l != null)
        l.x
      else
        0
    }

    def next(l: ListNode): ListNode = {
      if (l != null)
        l.next
      else
        l
    }

    var p1 = l1
    var p2 = l2
    val res = new ListNode(-1)
    var p = res
    var mod = 0
    var sum = 0

    while (p1 != null || p2 != null) {
      val d1 = getDigit(p1)
      p1 = next(p1)
      val d2 = getDigit(p2)
      p2 = next(p2)

      sum = (d1 + d2 + mod) % 10
      mod = (d1 + d2 + mod) / 10

      p.next = new ListNode(sum)
      p = p.next
    }

    if (mod != 0)
      p.next = new ListNode(mod)

    res.next
  }
}
