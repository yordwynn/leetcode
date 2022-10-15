package findDuplicateFileInSystem

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  def eq(l: List[List[String]], r: List[List[String]]): Boolean = {
    val sl = l.map(_.sorted)
    val sr = r.map(_.sorted)
    sl.forall(item => sr.contains(item))
  }

  "example 1" should "return [[\"root/a/2.txt\",\"root/c/d/4.txt\",\"root/4.txt\"],[\"root/a/1.txt\",\"root/c/3.txt\"]]" in {
    val paths = Array(
      "root/a 1.txt(abcd) 2.txt(efgh)",
      "root/c 3.txt(abcd)",
      "root/c/d 4.txt(efgh)",
      "root 4.txt(efgh)"
    )
    val res = List(
      List("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"),
      List("root/a/1.txt", "root/c/3.txt")
    )
    assert(eq(Solution.findDuplicate(paths), res))
  }

  "example 2" should "return [[\"root/a/2.txt\",\"root/c/d/4.txt\"],[\"root/a/1.txt\",\"root/c/3.txt\"]]" in {
    val paths = Array(
      "root/a 1.txt(abcd) 2.txt(efgh)",
      "root/c 3.txt(abcd)",
      "root/c/d 4.txt(efgh)"
    )
    val res = List(
      List("root/a/2.txt", "root/c/d/4.txt"),
      List("root/a/1.txt", "root/c/3.txt")
    )
    assert(eq(Solution.findDuplicate(paths), res))
  }
}
