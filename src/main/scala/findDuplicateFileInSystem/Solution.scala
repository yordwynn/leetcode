package findDuplicateFileInSystem

// 609. Find Duplicate File in System
object Solution {
  def findDuplicate(paths: Array[String]): List[List[String]] = {
    def parseFile(directory: String, file: String): (String, String) = {
      val Array(name, content) = file.split(Array('(', ')'))
      (directory ++ "/" ++ name, content)
    }

    paths
      .foldLeft(Map.empty[String, List[String]])((res, path) => {
        val split = path.split(" ")
        val directory = split(0)
        (1 until split.length).foldLeft(res)((files, i) => {
          val (path, content) = parseFile(directory, split(i))
          files.updated(content, path +: files.getOrElse(content, List.empty))
        })
      })
      .values
      .filter(_.length > 1)
      .toList
  }
}
