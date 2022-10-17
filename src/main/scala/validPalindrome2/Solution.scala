package validPalindrome2

// 680. Valid Palindrome II
object Solution {
  def validPalindrome(s: String): Boolean = {
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
