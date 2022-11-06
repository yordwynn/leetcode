package wordSearch2

case class Trie(nodes: Map[Char, Trie], index: Option[Int]) {
  def insert(word: String, id: Int): Trie =
    if (word.isEmpty)
      this.copy(index = Some(id))
    else
      this.copy(nodes =
        nodes.updated(
          word.head,
          nodes
            .getOrElse(word.head, Trie(Map.empty, None))
            .insert(word.tail, id)
        )
      )

  def get(char: Char): Option[Trie] = {
    nodes.get(char)
  }
}

// 212. Word Search II
object Solution {
  def findWords(
      board: Array[Array[Char]],
      words: Array[String]
  ): List[String] = {
    val visited = Array.fill(board.length, board(0).length)(false)

    def backtrack(
        i: Int,
        j: Int,
        trie: Trie
    ): Set[String] = {
      if (
        i < 0 || i >= board.length || j < 0 || j >= board(0).length || visited(
          i
        )(j)
      )
        Set.empty[String]
      else {
        trie
          .get(board(i)(j))
          .fold(Set.empty[String]) { t =>
            visited(i)(j) = true
            val res = t.index.fold(Set.empty[String])(id => Set(words(id))) ++
              backtrack(i - 1, j, t) ++
              backtrack(i, j + 1, t) ++
              backtrack(i + 1, j, t) ++
              backtrack(i, j - 1, t)
            visited(i)(j) = false
            res
          }
      }
    }

    val trie = words.zipWithIndex.foldLeft(Trie(Map.empty, None))((t, w) =>
      w match {
        case (word, id) => t.insert(word, id)
      }
    )
    val n = board.length
    val m = board(0).length

    (for {
      i <- 0 until n
      j <- 0 until m
    } yield backtrack(i, j, trie)).toSet.flatten.toList
  }
}
