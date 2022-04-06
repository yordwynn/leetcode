package example

object ThreeSumWithMultiplicity {
  def threeSumMulti(arr: Array[Int], target: Int): Int = {
    val mod = 1000000007
    var i = 0
    var res = 0
    val map = scala.collection.mutable.Map[Int, Int]()

    while (i < arr.length) {
      res = (res + map.getOrElse(target - arr(i), 0)) % mod
      var j = 0

      while (j < i) {
        map.put(arr(i) + arr(j), map.getOrElse(arr(i) + arr(j), 0) + 1)
        j = j + 1
      }

      i = i + 1
    }

    res
  }
}
