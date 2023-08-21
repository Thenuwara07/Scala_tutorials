object four {
  def check_num(num:Int):String={
    if (num==1){
      "Odd number"
    }
    else if(num==0){
      "Even number"
    }
    else{
      check_num(num-2)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val in = scala.io.StdIn.readInt()
    print(in + " is a " + check_num(in))
  }
}
