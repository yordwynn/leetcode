package fibonacciNumber

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 1" in {
    val n = 2

    assert(Solution.fib(n) == 1)
  }

  "example 2" should "return 2" in {
    val n = 3

    assert(Solution.fib(n) == 2)
  }

  "example 3" should "return 4" in {
    val n = 4

    assert(Solution.fib(n) == 3)
  }
}
