package example

object Greedy {
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
}
