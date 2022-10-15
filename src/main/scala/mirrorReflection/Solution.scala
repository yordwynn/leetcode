package mirrorReflection

import scala.annotation.tailrec

// 858. Mirror Reflection
object Solution {
  def mirrorReflection(p: Int, q: Int): Int = {
    @tailrec
    def nok(res: Int, i: Int): (Int, Int) =
      if (res % p == 0 && res % q == 0)
        (res, i)
      else
        nok(res + q, i + 1)

    val (n, i) = nok(q, 1)
    if (i % 2 == 0)
      2
    else if (n % (p * 2) == 0)
      0
    else
      1
  }
}
