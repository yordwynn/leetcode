package example

import scala.annotation.tailrec

object Palindrome2 {
  def main(args: Array[String]): Unit = {
    val x =
      "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"
    print(validPalindrome(x))
  }

  def validPalindrome(s: String): Boolean = {
    //@tailrec
    def go(l: Int, r: Int, skipped: Boolean): Boolean = {
      if (l > r)
        true
      else if (s(l) == s(r))
        go(l + 1, r - 1, skipped)
      else if (skipped)
        false
      else
        go(l + 1, r, skipped = true) || go(l, r - 1, skipped = true)
    }

    go(0, s.length - 1, skipped = false)
  }
}
