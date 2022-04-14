package example

object GenerateMatrix {
  def main(args: Array[String]): Unit = {
    val n = 4
    println(generateMatrix(n).map(_.mkString(", ")).mkString("\n"))
  }

  def generateMatrix(n: Int): Array[Array[Int]] = {
    val stepsCount = n * n
    val steps = Seq(0 -> 1, 1 -> 0, 0 -> -1, -1 -> 0)
    var k = 1
    val res = Array.fill(n, n)(0)

    var i = 0
    var j = 0
    var d = 0
    while (k <= stepsCount) {
      res(i)(j) = k

      i = i + steps(d)._1
      j = j + steps(d)._2

      if (i < 0 || i == n || j < 0 || j == n || res(i)(j) != 0) {
        i = i - steps(d)._1
        j = j - steps(d)._2
        d = (d + 1) % 4
        i = i + steps(d)._1
        j = j + steps(d)._2
      }

      k = k + 1
    }

    res
  }
}
