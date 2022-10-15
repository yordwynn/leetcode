package fibonacciNumber

import scala.annotation.tailrec

// 509. Fibonacci Number
object Solution {
  def fib(n: Int): Int = {
    @tailrec
    def go(f1: Int, f2: Int, i: Int): Int = {
      if (i == 0)
        f1
      else
        go(f2, f1 + f2, i - 1)
    }

    go(0, 1, n)
  }
}
