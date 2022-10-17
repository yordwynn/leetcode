package checkIfTheSentenceIsPangram

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return true" in {
    val sentence = "thequickbrownfoxjumpsoverthelazydog"
    assert(Solution.checkIfPangram(sentence))
  }

  "example 2" should "return false" in {
    val sentence = "leetcode"
    assert(!Solution.checkIfPangram(sentence))
  }
}
