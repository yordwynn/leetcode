package deleteNodeInALinkedList

import leetcode.utils.ListNode

// 237. Delete Node in a Linked List
object Solution {
  def deleteNode(node: ListNode): Unit = {
    node.x = node.next.x
    node.next = node.next.next
  }
}
