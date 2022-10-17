package deleteNodeInALinkedList

import leetcode.utils.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [4, 1, 9]" in {
    val head =
      new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))))
    val res = new ListNode(4, new ListNode(1, new ListNode(9)))
    Solution.deleteNode(head.next)
    assert(head == res)
  }

  "example 2" should "return [4, 5, 9]" in {
    val head =
      new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))))
    val res = new ListNode(4, new ListNode(5, new ListNode(9)))
    Solution.deleteNode(head.next.next)
    assert(head == res)
  }
}
