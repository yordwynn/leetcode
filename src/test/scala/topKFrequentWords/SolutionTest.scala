package topKFrequentWords

import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {
  "example 1" should """return ["i","love"]""" in {
    val words = Array("i", "love", "leetcode", "i", "love", "coding")
    val k = 2
    assert(Solution.topKFrequent(words, k) == List("i", "love"))
  }

  "example 2" should """return ["the","is","sunny","day"]""" in {
    val words = Array(
      "the",
      "day",
      "is",
      "sunny",
      "the",
      "the",
      "the",
      "sunny",
      "is",
      "is"
    )
    val k = 4
    assert(Solution.topKFrequent(words, k) == List("the", "is", "sunny", "day"))
  }

  "example 3" should """return ["the","is","sunny","day"]""" in {
    val words = Array(
      "glarko",
      "zlfiwwb",
      "nsfspyox",
      "pwqvwmlgri",
      "qggx",
      "qrkgmliewc",
      "zskaqzwo",
      "zskaqzwo",
      "ijy",
      "htpvnmozay",
      "jqrlad",
      "ccjel",
      "qrkgmliewc",
      "qkjzgws",
      "fqizrrnmif",
      "jqrlad",
      "nbuorw",
      "qrkgmliewc",
      "htpvnmozay",
      "nftk",
      "glarko",
      "hdemkfr",
      "axyak",
      "hdemkfr",
      "nsfspyox",
      "nsfspyox",
      "qrkgmliewc",
      "nftk",
      "nftk",
      "ccjel",
      "qrkgmliewc",
      "ocgjsu",
      "ijy",
      "glarko",
      "nbuorw",
      "nsfspyox",
      "qkjzgws",
      "qkjzgws",
      "fqizrrnmif",
      "pwqvwmlgri",
      "nftk",
      "qrkgmliewc",
      "jqrlad",
      "nftk",
      "zskaqzwo",
      "glarko",
      "nsfspyox",
      "zlfiwwb",
      "hwlvqgkdbo",
      "htpvnmozay",
      "nsfspyox",
      "zskaqzwo",
      "htpvnmozay",
      "zskaqzwo",
      "nbuorw",
      "qkjzgws",
      "zlfiwwb",
      "pwqvwmlgri",
      "zskaqzwo",
      "qengse",
      "glarko",
      "qkjzgws",
      "pwqvwmlgri",
      "fqizrrnmif",
      "nbuorw",
      "nftk",
      "ijy",
      "hdemkfr",
      "nftk",
      "qkjzgws",
      "jqrlad",
      "nftk",
      "ccjel",
      "qggx",
      "ijy",
      "qengse",
      "nftk",
      "htpvnmozay",
      "qengse",
      "eonrg",
      "qengse",
      "fqizrrnmif",
      "hwlvqgkdbo",
      "qengse",
      "qengse",
      "qggx",
      "qkjzgws",
      "qggx",
      "pwqvwmlgri",
      "htpvnmozay",
      "qrkgmliewc",
      "qengse",
      "fqizrrnmif",
      "qkjzgws",
      "qengse",
      "nftk",
      "htpvnmozay",
      "qggx",
      "zlfiwwb",
      "bwp",
      "ocgjsu",
      "qrkgmliewc",
      "ccjel",
      "hdemkfr",
      "nsfspyox",
      "hdemkfr",
      "qggx",
      "zlfiwwb",
      "nsfspyox",
      "ijy",
      "qkjzgws",
      "fqizrrnmif",
      "qkjzgws",
      "qrkgmliewc",
      "glarko",
      "hdemkfr",
      "pwqvwmlgri"
    )
    val k = 14
    assert(
      Solution.topKFrequent(words, k) == List(
        "nftk",
        "qkjzgws",
        "qrkgmliewc",
        "nsfspyox",
        "qengse",
        "htpvnmozay",
        "fqizrrnmif",
        "glarko",
        "hdemkfr",
        "pwqvwmlgri",
        "qggx",
        "zskaqzwo",
        "ijy",
        "zlfiwwb"
      )
    )
  }
}
