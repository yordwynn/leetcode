package linkedListCycle

import leetcode.utils.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val cycle = new ListNode(2, new ListNode(0, new ListNode(-4)))
    cycle.next.next.next = cycle
    val head = new ListNode(3, cycle)
    assert(Solution.hasCycle(head))
  }

  "example 2" should "return true" in {
    val cycle = new ListNode(1, new ListNode(2))
    cycle.next.next = cycle
    val head = cycle
    assert(Solution.hasCycle(head))
  }

  "example 3" should "return false" in {
    val head = new ListNode(1)
    assert(!Solution.hasCycle(head))
  }
}
