package simplifyPath

// 71. Simplify Path
object Solution {
  def simplifyPath(path: String): String = {
    val parts = path.split("/+")
    val canonical = parts.foldLeft(List.empty[String])((b, s) => {
      s match {
        case "."  => b
        case ".." => if (b.isEmpty) b else b.tail
        case ""   => b
        case _    => b.prepended(s)
      }
    })
    "/" ++ canonical.reverse.mkString("/")
  }
}
