package functions

import scala.math.sqrt
// make sure you import things if you need to use a specific module because without this specific one 
//-scala would not know what sqrt was, and its much easier to just import it rather then to make fuction.

//when you click run it starts with main and goes back to the functions defined in object before it
object QuadraticFormula {
  // TASK:
  //      Write a test to validate the following function.

  def quadraticFormula(a: Int, b: Int, c: Int): List[Double] = {
    
 // a double is with a decimal value and Int is just one    
val d = discriminant(a,b,c)
if ( d == 0)
  { 
   List(-b/(2*a))
  }
else if ( d < 0) 
  {
    List()
  }

else 
  {
    List(
       -b + sqrt(d) / (2 * a),
      -b - sqrt(d) / (2 * a)
    ).sorted
  // .sorted is to sort the list so that it is a;ways in ascending order regardless of negative or positive
  // however when a is zero you get the value infinity, and if you try to solve for infinity you would always get thats not a number, how do you solve this?
  }

        
  }
 
  
  def discriminant(a: Int, b: Int, c: Int):Int = {
    (b * b - (4 * a * c))
   
  
  }


// array is an orderd list and storage and you can find an array by index, 
// you cant do that with a list you would just go in order until you find what your looking for in that list
 def main(argv: Array[String]): Unit = {
    println("Hello this is main of QuadraticFormula")
    println(quadraticFormula(0, 2, -3))
    println(quadraticFormula(0, 3, 7))
  }
 
  
  // TASK:
  //    Update the formula to compute the discriminant,
  //    and detect whether there are zero, one, or two real roots.
  //    refactor the function to return a list of length 0, 1, or 2
  //    accordingly.  If there are two roots return them in increasing
  //    order.

  // TASK:
  //    Do your tests still work?  If not, do you need to
  //    update your tests, or do you need to update the function?
  //    Make sure your tests are up to date, and that they test the
  //    new features you implemented in previous step.

  

}

