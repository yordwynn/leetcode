package wordLadder2

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [[hit,hot,dot,dog,сog],[hit,hot,lot,log,cog]]" in {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log", "cog")
    val res = List(
      List("hit", "hot", "lot", "log", "cog"),
      List("hit", "hot", "dot", "dog", "cog")
    )
    assert(Solution.findLadders(beginWord, endWord, wordList) == res)
  }

  "example 2" should "return []" in {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log")
    val res = Nil
    assert(Solution.findLadders(beginWord, endWord, wordList) == res)
  }
}
