package rangeSumQueryMutable

import org.scalatest.flatspec.AnyFlatSpec

class NumArrayTest extends AnyFlatSpec {
  "example 1" should "return [null, 9, null, 8]" in {
    val obj = new NumArray(Array(1, 3, 5))
    assert(obj.sumRange(0, 2) == 9)

    obj.update(1, 2)
    assert(obj.sumRange(0, 2) == 8)
  }
}
