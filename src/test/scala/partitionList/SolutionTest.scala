package partitionList

import example.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,2,2,4,3,5]" in {
    val head = ListNode(1, 4, 3, 2, 5, 2)
    val x = 3

    assert(Solution.partition(head, x) == ListNode(1, 2, 2, 4, 3, 5))
  }

  "example 2" should "return [1,2]" in {
    val head = ListNode(2, 1)
    val x = 2

    assert(Solution.partition(head, x) == ListNode(1, 2))
  }
}
