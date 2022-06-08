package functions

object FastPower {

  // TASK:
  //     Implement two functions named power, one which accepts
  //      and Int base and Int exponent, and a second which accepts
  //      a Double base and Int exponent.  The second function should
  //      also support a negative exponent, however the first one cannot.
  //      Why can it not?
  //
  def power(b: Int, n: Int): Int = {
    if( n == 0)
    {
      1
    }
    else
      {
        b * power(b,n-1)
      }
  }

  def power(b: Double, n: Int): Double = {
    if( n == 0)
    {
      1
    }
    else if (n>0)
      {
        b * power(b,n-1)
      }
    else 
      {
        1/power(b,-n)
      }
  }

  // TASK:
  //      Implement String concatenation using the same model as the
  //      power function.  The function should accept a String, and an
  //      exponent n >= 0.  What should it return if n=0?
  def power(b: String, n: Int): String = {
   if (n == 0)
     
    ""
  else
    b ++ power(b,n-1)  
  }

  // 6. TASK:
  //      Implement List concatenation using the same concept.  What
  //      should the function return when n=0?
  def power[T](b: List[T], n: Int): List[T] = {
    if (n==0)
      List()
    else
      b ++ power(b, n-1) 
  }
// square brackets are type declerations and () are the constructers in lists
  def main(argv: Array[String]): Unit = {
    println(power(5.8,-6))
    println(power("jello",5))
    println(power(List(1,2,4),5))

  }
}
//though they are all named power the parameters are the same