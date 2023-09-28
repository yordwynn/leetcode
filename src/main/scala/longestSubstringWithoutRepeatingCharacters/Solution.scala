package longestSubstringWithoutRepeatingCharacters

import scala.collection.mutable

// 3. Longest Substring Without Repeating Characters
object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    val metSymbols = mutable.Map[Char, Int]()

    //z is (left_pointer, right_pointer, max_substring_length)
    s.foldLeft((0, 0, 0))((res, symbol) => {
      val (left, right, maxLength) = res
      val symbolInd = metSymbols.get(symbol)
      metSymbols.addOne((symbol, right))

      symbolInd.fold((left, right + 1, (right - left + 1).max(maxLength))) { index =>
        val newLeft = (index + 1).max(left) //shift indexes only to the right
        (newLeft, right + 1, (right - newLeft + 1).max(maxLength))
      }
    })._3
  }
}
