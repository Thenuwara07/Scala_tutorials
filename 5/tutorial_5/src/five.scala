object five {
  def addition_of_even(num:Int):Int={
    val res=num-1
    if (res<=0) {
      0
    }
    else if (res%2==0){
      res+addition_of_even(res-1)
    }
    else{
      addition_of_even(res)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val in = scala.io.StdIn.readInt()
    print("Addition of all even number is a " + addition_of_even(in))
  }

}
