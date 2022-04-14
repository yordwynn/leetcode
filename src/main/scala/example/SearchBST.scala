package example

import scala.annotation.tailrec

object SearchBST {
  @tailrec
  def searchBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root == null)
      root
    else if (root.value == `val`)
      root
    else if (root.value > `val`)
      searchBST(root.left, `val`)
    else
      searchBST(root.right, `val`)
  }
}
