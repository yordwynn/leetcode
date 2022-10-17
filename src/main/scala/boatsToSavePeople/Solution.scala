package boatsToSavePeople

// 881. Boats to Save People
object Solution {
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
