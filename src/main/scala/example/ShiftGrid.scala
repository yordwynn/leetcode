package example

object ShiftGrid {
  def main(args: Array[String]): Unit = {
    val grid = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    val k = 9
    println(shiftGrid(grid, k).map(_.mkString(", ")).mkString("\n"))
  }
  def shiftGrid(grid: Array[Array[Int]], k: Int): List[List[Int]] = {
    val m = grid.length
    val n = grid(0).length
    val res = Array.fill(m, n)(0)

    var i = 0
    while (i < m) {
      var j = 0
      while (j < n) {
        val newi = (i + (j + k) / n) % m
        val newj = (j + k) % n
        res(newi)(newj) = grid(i)(j)
        j = j + 1
      }
      i = i + 1
    }

    res.map(_.toList).toList
  }
}
