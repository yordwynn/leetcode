package nAryTreeLevelOrderTraversal

import node.Node
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[1],[3,2,4],[5,6]]" in {
    val root =
      new Node(
        1,
        List(
          new Node(3, List(new Node(5), new Node(6))),
          new Node(2),
          new Node(4)
        )
      )
    val res = List(List(1), List(3, 2, 4), List(5, 6))
    assert(Solution.levelOrder(root) == res)
  }

  "example 2" should "return [[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]" in {
    val root =
      new Node(
        1,
        List(
          new Node(2),
          new Node(
            3,
            List(
              new Node(6),
              new Node(7, List(new Node(11, List(new Node(14)))))
            )
          ),
          new Node(4, List(new Node(8, List(new Node(12))))),
          new Node(5, List(new Node(9, List(new Node(13))), new Node(10)))
        )
      )
    val res =
      List(
        List(1),
        List(2, 3, 4, 5),
        List(6, 7, 8, 9, 10),
        List(11, 12, 13),
        List(14)
      )
    assert(Solution.levelOrder(root) == res)
  }
}
