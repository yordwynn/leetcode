package rotateList

import leetcode.utils.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [4,5,1,2,3]" in {
    val head = ListNode(1, 2, 3, 4, 5)
    val k = 2
    assert(Solution.rotateRight(head, k) == ListNode(4, 5, 1, 2, 3))
  }

  "example 1" should "return [2,0,1]" in {
    val head = ListNode(0, 1, 2)
    val k = 4
    assert(Solution.rotateRight(head, k) == ListNode(2, 0, 1))
  }
}
