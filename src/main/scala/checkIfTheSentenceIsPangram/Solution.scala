package checkIfTheSentenceIsPangram

// 1832. Check if the Sentence Is Pangram
object Solution {
  def checkIfPangram(sentence: String): Boolean = {
    val counter = sentence.foldLeft(0)((res, item) => {
      res | 1 << (item - 'a')
    })
    counter == 67108863
  }
}
