package addTwoNumbers

import leetcode.utils.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [7,0,8]" in {
    val l1 = ListNode(2, 4, 3)
    val l2 = ListNode(5, 6, 4)
    assert(Solution.addTwoNumbers(l1, l2) == ListNode(7, 0, 8))
  }

  "example 2" should "return [0]" in {
    val l1 = ListNode(0)
    val l2 = ListNode(0)
    assert(Solution.addTwoNumbers(l1, l2) == ListNode(0))
  }

  "example 3" should "return [7,0,8]" in {
    val l1 = ListNode(9, 9, 9, 9, 9, 9, 9)
    val l2 = ListNode(9, 9, 9, 9)
    assert(Solution.addTwoNumbers(l1, l2) == ListNode(8, 9, 9, 9, 0, 0, 0, 1))
  }
}
