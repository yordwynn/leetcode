package mergeTwoSortedLists

import leetcode.utils.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,1,2,3,4,4]" in {
    val list1 = ListNode(1, 2, 4)
    val list2 = ListNode(1, 3, 4)
    assert(Solution.mergeTwoLists(list1, list2) == ListNode(1, 1, 2, 3, 4, 4))
  }

  "example 2" should "return []" in {
    val list1 = ListNode()
    val list2 = ListNode()
    assert(Solution.mergeTwoLists(list1, list2) == ListNode())
  }

  "example 3" should "return [0]" in {
    val list1 = ListNode()
    val list2 = ListNode(0)
    assert(Solution.mergeTwoLists(list1, list2) == ListNode(0))
  }
}
