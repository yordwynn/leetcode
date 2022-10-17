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
  def fromList(list: List[Int]): ListNode =
    list.foldRight(null: ListNode)((item, acc) => new ListNode(item, acc))
}
