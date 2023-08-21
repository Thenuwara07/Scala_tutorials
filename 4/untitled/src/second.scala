object second {
  def check_int(num : Int): String = {
    if (num<0){
      return "Negative"
    }
    else if(num==0){
      return "Zero"
    }
    else if((num%2)==0){
      return "Even"
    }
    else{
      return "Odd"
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number - ")
    var number=scala.io.StdIn.readInt()
    println(check_int(number))
  }
}
