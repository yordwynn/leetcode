package theKWeakestRowsInAMatrix

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return Array(2,0,3)" in {
    val mat =
      Array(
        Array(1, 1, 0, 0, 0),
        Array(1, 1, 1, 1, 0),
        Array(1, 0, 0, 0, 0),
        Array(1, 1, 0, 0, 0),
        Array(1, 1, 1, 1, 1)
      )
    val k = 3
    assert(Solution.kWeakestRows(mat, k) sameElements Array(2, 0, 3))
  }

  "example 2" should "return Array(0,2)" in {
    val mat =
      Array(
        Array(1, 0, 0, 0),
        Array(1, 1, 1, 1),
        Array(1, 0, 0, 0),
        Array(1, 0, 0, 0)
      )
    val k = 2
    assert(Solution.kWeakestRows(mat, k) sameElements Array(0, 2))
  }
}
