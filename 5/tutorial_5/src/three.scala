object three {
  def sum(num: Int):Int = {
    if (num <= 0) {
      0
    }
    else {
      num + sum(num-1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val in = scala.io.StdIn.readInt()
    println(sum(in))
  }
}
