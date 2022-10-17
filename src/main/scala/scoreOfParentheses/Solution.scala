package scoreOfParentheses

// 856. Score of Parentheses
object Solution {
  def scoreOfParentheses(s: String): Int = {
    s.foldLeft(Seq(0))((b, ch) =>
      ch match {
        case '(' => b.prepended(0)
        case ')' =>
          val w = b.head
          val v = b(1)
          val rest = b.tail.tail
          val x = v + Math.max(1, w * 2)
          rest.prepended(x)
      }
    ).head
  }
}
