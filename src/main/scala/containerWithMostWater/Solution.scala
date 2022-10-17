package containerWithMostWater

// 11. Container With Most Water
object Solution {
  def maxArea(height: Array[Int]): Int = {
    def getArea(l: Int, r: Int, width: Int): Int = {
      Math.min(l, r) * width
    }
    var l = 0
    var r = height.length - 1
    var max = getArea(height(l), height(r), r - l)

    while (l < r) {
      if (height(l) < height(r))
        l = l + 1
      else
        r = r - 1

      max = Math.max(max, getArea(height(l), height(r), r - l))
    }

    max
  }
}
