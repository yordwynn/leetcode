package example

import java.util
import scala.collection.mutable

object StringProblems {
  def main(args: Array[String]): Unit = {
    val path = "bcabc"
    print(removeDuplicateLetters(path))
  }

  def simplifyPath(path: String): String = {
    val parts = path.split("/+")
    val canonical = parts.foldLeft(List.empty[String])((b, s) => {
      s match {
        case "."  => b
        case ".." => if (b.isEmpty) b else b.tail
        case ""   => b
        case _    => b.prepended(s)
      }
    })
    "/" ++ canonical.reverse.mkString("/")
  }

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

  def removeDuplicateLetters(s: String): String = {
    val indexed = s.zipWithIndex
    val lastSeen =
      indexed.foldLeft(Map.empty[Char, Int])((inds, item) => inds + item)
    val used = new mutable.HashSet[Char]()
    val res = new util.Stack[Char]()

    indexed.foreach { case (item, index) =>
      if (!used.contains(item)) {
        while (
          !res.empty() && item < res.peek() && index < lastSeen(res.peek())
        ) {
          val x = res.pop()
          used.remove(x)
        }
        used.add(item)
        res.push(item)
      }
    }

    val sb = new StringBuilder()
    while (!res.empty())
      sb.append(res.pop())

    sb.toString.reverse
  }
}
