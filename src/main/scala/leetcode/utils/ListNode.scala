package leetcode.utils

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

object ListNode {
  def apply(xs: Int*): ListNode = {
    val h = new ListNode()
    xs.foldLeft(h)((acc, x) => {
      acc.next = new ListNode(_x = x)
      acc.next
    })
    h.next
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
}
