package removeDuplicatesFromSortedList2

import leetcode.utils.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [1,2,5]" in {
    val head = ListNode(1, 2, 3, 3, 4, 4, 5)
    assert(Solution.deleteDuplicates(head) == ListNode(1, 2, 5))
  }

  "example 2" should "return [2,3]" in {
    val head = ListNode(1, 1, 1, 2, 3)
    assert(Solution.deleteDuplicates(head) == ListNode(2, 3))
  }
}
