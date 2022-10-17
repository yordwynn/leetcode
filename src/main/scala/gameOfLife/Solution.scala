package gameOfLife

// 289. Game of Life
object Solution {
  def gameOfLife(board: Array[Array[Int]]): Unit = {
    def getCount(i: Int, j: Int): Int = {
      val m = board.length
      val n = board(0).length

      val cells = Seq(
        if (i > 0 && j > 0) Math.abs(board(i - 1)(j - 1)) % 2 else 0,
        if (i > 0) Math.abs(board(i - 1)(j)) % 2 else 0,
        if (i > 0 && j < n - 1) Math.abs(board(i - 1)(j + 1)) % 2 else 0,
        if (j > 0) Math.abs(board(i)(j - 1)) % 2 else 0,
        if (j < n - 1) Math.abs(board(i)(j + 1)) % 2 else 0,
        if (i < m - 1 && j > 0) Math.abs(board(i + 1)(j - 1)) % 2 else 0,
        if (i < m - 1) Math.abs(board(i + 1)(j)) % 2 else 0,
        if (i < m - 1 && j < n - 1) Math.abs(board(i + 1)(j + 1)) % 2 else 0
      )

      cells.sum
    }

    val m = board.length
    val n = board(0).length

    var i = 0
    while (i < m) {
      var j = 0
      while (j < n) {
        val cnt = getCount(i, j)
        board(i)(j) match {
          case 0 =>
            if (cnt == 3) board(i)(j) = 2
          case 1 =>
            if (cnt < 2 || cnt > 3) board(i)(j) = -1
        }
        j = j + 1
      }
      i = i + 1
    }

    i = 0
    while (i < m) {
      var j = 0
      while (j < n) {
        val x = board(i)(j)
        if (x == -1) board(i)(j) = 0
        if (x == 2) board(i)(j) = 1
        j = j + 1
      }
      i = i + 1
    }
  }
}
