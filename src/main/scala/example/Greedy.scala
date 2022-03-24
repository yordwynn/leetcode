package example

object Greedy {
  def main(args: Array[String]): Unit = {
    val people = Array(5, 1, 7, 4, 2, 4)
    print(numRescueBoats(people, 7))
  }

  def brokenCalc(startValue: Int, target: Int): Int = {
    var res = 0
    var current = target

    while (current > startValue) {
      res = res + 1
      if (current % 2 != 0) {
        current = current + 1
      } else {
        current = current / 2
      }
    }

    res + (startValue - current)
  }

  def numRescueBoats(people: Array[Int], limit: Int): Int = {
    val sortedPeople = people.sorted(Ordering.Int.reverse)
    var res = 0
    var p = 0

    while (p < people.length) {
      if (sortedPeople(p) > -1) {
        val first = sortedPeople(p)

        var p2 = p + 1
        while (
          p2 < sortedPeople.length && ((sortedPeople(
            p2
          ) == -1) || first + sortedPeople(p2) > limit)
        )
          p2 = p2 + 1

        if (p2 == sortedPeople.length) {
          res = res + 1
        } else {
          res = res + 1
          sortedPeople(p2) = -1
        }
      }
      p = p + 1
    }

    res
  }
}
