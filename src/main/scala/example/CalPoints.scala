package example

object CalPoints {
  def main(args: Array[String]): Unit = {}
  def calPoints(ops: Array[String]): Int = {
    ops
      .foldLeft(List.empty[Int])((rec, item) =>
        item match {
          case "+" =>
            val l = rec.head
            val r = rec.tail.head
            (l + r) +: rec
          case "D" =>
            (rec.head * 2) +: rec
          case "C" =>
            rec.tail
          case s =>
            s.toInt +: rec
        }
      )
      .sum
  }
}
