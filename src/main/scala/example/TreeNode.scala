package example

class TreeNode(
    _value: Int = 0,
    _left: TreeNode = null,
    _right: TreeNode = null
) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right

  override def equals(obj: Any): Boolean = obj match {
    case t: TreeNode =>
      t.value == this.value && t.left == this.left && t.right == this.right
    case _ => false
  }
}
