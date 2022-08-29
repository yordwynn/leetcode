package numberOfIslands

//200. Number of Islands
object Solution {
  def numIslands(grid: Array[Array[Char]]): Int = {
    val m = grid.length
    val n = grid(0).length
    val visited = Array.fill(grid.length, grid(0).length)(0)

    def dfs(i: Int, j: Int): Int = {
      if (i >= m || j >= n || i < 0 || j < 0 || visited(i)(j) == 1)
        0
      else if (grid(i)(j) == '0') {
        visited(i)(j) = 1
        0
      } else {
        visited(i)(j) = 1
        dfs(i + 1, j)
        dfs(i - 1, j)
        dfs(i, j + 1)
        dfs(i, j - 1)
        1
      }
    }

    def index(i: Int): (Int, Int) = (i / n, i % n)

    (0 to m * n)
      .foldLeft(List.empty[Int]) { (res, i) =>
        val ind = index(i)
        if (dfs(ind._1, ind._2) == 1) 1 +: res else res
      }
      .sum
  }
}
