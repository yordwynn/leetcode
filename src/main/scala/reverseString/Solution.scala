package reverseString

// 344. Reverse String
object Solution {
  def reverseString(s: Array[Char]): Unit = {
    var l = 0
    var r = s.length - 1

    while (l < r) {
      val buf = s(l)
      s(l) = s(r)
      s(r) = buf
      l = l + 1
      r = r - 1
    }
  }
}
