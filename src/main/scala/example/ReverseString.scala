package example

object ReverseString {
  def main(args: Array[String]): Unit = {
    val x = Array('h', 'e', 'l', 'l', 'o')

    print(reverseString(x))
  }

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
