package node

class Node(var _value: Int, var _children: List[Node] = List()) {
  var value: Int = _value
  var children: List[Node] = _children
}
