package example

import scala.annotation.tailrec

object ListNode {
  def main(args: Array[String]): Unit = {
    val l = new ListNode(
      1,
      new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))
    )
    val res = swapNodes(l, 2)
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

  def rotateRight(head: ListNode, k: Int): ListNode = {
    val lngth = length(head)
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

  def length(head: ListNode): Int = {
    var res = 0
    var p = head

    while (p != null) {
      res = res + 1
      p = p.next
    }

    res
  }

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

  def apply(xs: Int*): ListNode = {
    val h = new ListNode()
    xs.foldLeft(h)((acc, x) => {
      acc.next = new ListNode(_x = x)
      acc.next
    })
    h.next
  }
}

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x

  override def equals(obj: Any): Boolean = obj match {
    case t: ListNode =>
      t.x == this.x && t.next == this.next
    case null =>
      this == null
    case _ => false
  }
}
