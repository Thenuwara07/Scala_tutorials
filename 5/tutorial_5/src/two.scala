object two {
  def prime(num: Int, x: Int = 2): Unit = {
    if (num > 1) {
      if (num == 2) {
        print(num + " ")
      }
      else if (num > x && num % x == 0) {
      }
      else if (num == x && num % x == 0) {
        print(num + " ")
      }
      else {
        prime(num, x + 1)
      }
    }
    else {
    }
  }

  def primeSeq(n:Int,n1:Int=1): Unit = {
    if (n>=n1) {
      prime(n1)
      primeSeq(n,n1+1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val in = scala.io.StdIn.readInt()
    primeSeq(in)
  }
}
