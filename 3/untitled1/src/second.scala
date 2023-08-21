object second {
  def filter(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  def main(args: Array[String]) = {
    val list: List[String] = List("Maze runner", "Mission impossible", "Race", "Hobbit", "Flash", "Bat man")
    println("Strings: " + filter(list).mkString(","))
  }
}
