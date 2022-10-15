package uniqueMorseCodeWords

// 804. Unique Morse Code Words
object Solution {
  private val morse: Array[String] = Array(
    ".-",
    "-...",
    "-.-.",
    "-..",
    ".",
    "..-.",
    "--.",
    "....",
    "..",
    ".---",
    "-.-",
    ".-..",
    "--",
    "-.",
    "---",
    ".--.",
    "--.-",
    ".-.",
    "...",
    "-",
    "..-",
    "...-",
    ".--",
    "-..-",
    "-.--",
    "--.."
  )

  def uniqueMorseRepresentations(words: Array[String]): Int = {
    words
      .toSet[String]
      .map { word =>
        word
          .foldLeft(Vector.empty[String])((vec, letter) =>
            vec.appended(morse(letter - 'a'))
          )
          .mkString
      }
      .size
  }
}
