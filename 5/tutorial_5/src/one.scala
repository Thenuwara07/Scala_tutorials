object one {
  def prime(num:Int,x:Int=2):Boolean={
    if (num>1){
      if (num==2){
        true
      }
      else if (num>x&&num%x==0){
        false
      }
      else if (num==x&&num%x==0){
        true
      }
      else{
        prime(num,x+1)
      }
    }
    else {
      return false
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val in= scala.io.StdIn.readInt()
    println(prime(in))
  }

}
