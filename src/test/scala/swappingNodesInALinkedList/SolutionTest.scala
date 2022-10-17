package swappingNodesInALinkedList

import leetcode.utils.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,4,3,2,5]" in {
    val head = ListNode(1, 2, 3, 4, 5)
    val k = 2
    assert(
      Solution.swapNodes(head, k) == ListNode(1, 4, 3, 2, 5)
    )
  }

  "example 2" should "return [7,9,6,6,8,7,3,0,9,5]" in {
    val head = ListNode(7, 9, 6, 6, 7, 8, 3, 0, 9, 5)
    val k = 5
    assert(
      Solution.swapNodes(head, k) == ListNode(7, 9, 6, 6, 8, 7, 3, 0, 9, 5)
    )
  }
}
