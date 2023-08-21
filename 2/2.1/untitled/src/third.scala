object third {
  def totalsalary(normal_hours: Double, ot_hours: Double): Double = (normal_hours * 250) + (ot_hours * 85);

  def take_home_salary(t_salary: Double): Double = (t_salary * 0.88);

  def main(args: Array[String]): Unit = {
    println("Weekly take home salary = " + take_home_salary(totalsalary(40, 30)));
  }
}
