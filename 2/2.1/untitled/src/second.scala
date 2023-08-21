object second {
  def main(args: Array[String]) = {
    var a: Int = 2;
    var b: Int = 3;
    var c: Int = 4;
    var d: Int = 5;
    var g: Int = 4;
    var k: Float = 4.3f;

    q1();
    q2();
    q3();
    q4();
    q5();

    def q1(): Int = {
      b = b - 1;
      println(b * a + c * d)
      d = d - 1;
      d
    }

    def q2(): Int = {
      println(a)
      a = a + 1;
      a
    }

    def q3(): Float = {
      var n = (-2) * (g - k) + c
      println(n);
      n
    }

    def q4(): Int = {
      println(c)
      c = c + 1;
      c

    }

    def q5(): Int = {
      c = c + 1
      println(c * a)
      a = a + 1;
      a
    }
  }

    //println(--b * a + c * d--)  Not Supported
    //println(a++)  Not Supported
    //println(-2 * (g-k) + c)  Not declared
    //println(c=c++)  Not Supported
    //println(c=++c*a++)  Not Supported

}
