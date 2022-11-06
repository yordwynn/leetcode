package wordSearch2

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should "return [eat,oath]" in {
    val board = Array(
      Array('o', 'a', 'a', 'n'),
      Array('e', 't', 'a', 'e'),
      Array('i', 'h', 'k', 'r'),
      Array('i', 'f', 'l', 'v')
    )
    val words = Array("oath", "pea", "eat", "rain")

    assert(Solution.findWords(board, words).sorted == Seq("eat", "oath").sorted)
  }

  "example 2" should "return []" in {
    val board = Array(
      Array('a', 'b'),
      Array('c', 'c')
    )
    val words = Array("abcb")

    assert(Solution.findWords(board, words).isEmpty)
  }

  "example 3" should "return [oa,oaa]" in {
    val board = Array(
      Array('o', 'a', 'b', 'n'),
      Array('o', 't', 'a', 'e'),
      Array('a', 'h', 'k', 'r'),
      Array('a', 'f', 'l', 'v')
    )
    val words = Array("oa", "oaa")

    assert(Solution.findWords(board, words).sorted == Seq("oa", "oaa").sorted)
  }

  "example 4" should "return [oath,eat,hklf,hf]" in {
    val board = Array(
      Array('o', 'a', 'a', 'n'),
      Array('e', 't', 'a', 'e'),
      Array('i', 'h', 'k', 'r'),
      Array('i', 'f', 'l', 'v')
    )
    val words = Array("oath", "pea", "eat", "rain", "hklf", "hf")

    assert(
      Solution.findWords(board, words).sorted == Seq(
        "oath",
        "eat",
        "hklf",
        "hf"
      ).sorted
    )
  }

  "example 5" should "return [oath,eat,hklf,hf]" in {
    val board = Array(
      Array('a', 'b'),
      Array('a', 'a')
    )
    val words = Array("aba", "baa", "bab", "aaab", "aaa", "aaaa", "aaba")

    assert(
      Solution.findWords(board, words).sorted == Seq(
        "aba",
        "aaa",
        "aaab",
        "baa",
        "aaba"
      ).sorted
    )
  }
}
