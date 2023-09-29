package wordLadder

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return 5" in {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log", "cog")

    assert(Solution.ladderLength(beginWord, endWord, wordList) == 5)
  }

  "example 2" should "return 0" in {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log")

    assert(Solution.ladderLength(beginWord, endWord, wordList) == 0)
  }

  "example 3" should "return 0" in {
    val beginWord = "hot"
    val endWord = "dog"
    val wordList = List("hot", "dog")

    assert(Solution.ladderLength(beginWord, endWord, wordList) == 0)
  }

  "example 4" should "return 0" in {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "tog", "cog")

    assert(Solution.ladderLength(beginWord, endWord, wordList) == 0)
  }
}
