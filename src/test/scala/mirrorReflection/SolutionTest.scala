package mirrorReflection

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 2" in {
    val p = 2
    val q = 1
    assert(Solution.mirrorReflection(p, q) == 2)
  }

  "example 2" should "return 1" in {
    val p = 3
    val q = 1
    assert(Solution.mirrorReflection(p, q) == 1)
  }
}
