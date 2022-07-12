package matchsticksToSquare

object Solution {
  def makesquare(matchsticks: Array[Int]): Boolean = {
    def go(i: Int, j: Int, sides: Array[Int], target: Int): Boolean = {
      if (j >= 4)
        false
      else if (i == matchsticks.length)
        sides(0) == sides(1) && sides(1) == sides(2) && sides(2) == sides(3)
      else {
        val x = matchsticks(i)
        if (sides(j) + x <= target) {
          sides(j) = sides(j) + x
          if (go(i + 1, 0, sides, target))
            true
          else {
            sides(j) = sides(j) - x
            go(i, j + 1, sides, target)
          }
        } else
          go(i, j + 1, sides, target)
      }
    }

    matchsticks.sortInPlace()(Ordering.Int.reverse)
    val sum = matchsticks.sum
    if (sum % 4 == 0) {
      val target = sum / 4
      val x = go(0, 0, Array.fill(4)(0), target)
      x
    } else
      false
  }
}
