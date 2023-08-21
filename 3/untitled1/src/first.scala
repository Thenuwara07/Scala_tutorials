object first {
  def reverse(str: String): String = {
    if (str.isEmpty) ""
    else reverse(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    var str1: String = "Wellcome"
    println("Reversed String: " + reverse(str1))
  }
}
