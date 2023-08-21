object third {
  def avarage(n1: Int, n2: Int): Float = (n1.toFloat + n2.toFloat) / 2

  def main(args: Array[String]) = {
    printf("Average: %.2f \n", avarage(46, 81))
  }
}