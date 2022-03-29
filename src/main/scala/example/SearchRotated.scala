package example

object SearchRotated {
  def main(args: Array[String]): Unit = {
    val x =
      Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

    println(search(x, 13))
  }

  def search(nums: Array[Int], target: Int): Boolean = ???
}
