object fourth {
  def profit(ticket:Double,attendence:Int):Double = (ticket*attendence)-(500+(3*attendence));
  def main(args: Array[String]) =  {
    println("Profit of first method = " + profit(15, 120));
    println("Profit of second method = " + profit(10, 140));
    println("Profit of thierd method = " + profit(20, 100));

    println("The best ticket price is= 20");
  }
}
object check {
  def profit(ticket: Double, attendence: Int): Double = (ticket * attendence) - (500 + (3 * attendence));

  def main(args: Array[String]) = {
    var flag: Int = 1;
    var max: Double = profit(1,176);
    var _price: Double = 2;
    var _attendence: Int = 172;
    var best_price: Double = 0;
    while (flag == 1) {
      if (max < profit(_price, _attendence)) {
        max = profit(_price, _attendence);
      }
      else {
        flag = 0;
        best_price=_price-1;
      }
      _price=_price+1.0;
      _attendence=_attendence-4;
    }
    println("Best profit price is " + max);
    println("Best tiket price is " + (best_price));
  }
}



