object first {
  def total_amount(amount: Double): Double = {
    if (amount<20000){
      return ((amount*0.02)+amount)
    }
    else if (amount < 200000) {
      return ((amount * 0.04) + amount)
    }
    else if (amount < 2000000) {
      return ((amount * 0.035) + amount)
    }
    else {
      return ((amount * 0.065) + amount)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount- ")
    var amount=scala.io.StdIn.readDouble()
    println("Amount " + total_amount(amount))
  }
}
