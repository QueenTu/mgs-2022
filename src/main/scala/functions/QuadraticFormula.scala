package functions

import scala.math.sqrt
// make sure you import things if you need to use a specific module because without this specific one 
//-scala would not know what sqrt was, and its much easier to just import it rather then to make fuction.

//when you click run it starts with main and goes back to the functions defined in object before it
object QuadraticFormula {


 // a double is with a decimal value and Int is just one    

  // .sorted is to sort the list so that it is a;ways in ascending order regardless of negative or positive
  // however when a is zero you get the value infinity, and if you try to solve for infinity you would always get thats not a number, how do you solve this?
 


// array is an orderd list and storage and you can find an array by index, 
// you cant do that with a list you would just go in order until you find what your looking for in that list

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

  def discriminant(a:Int, b:Int, c:Int): Int = {
    b*b - 4*a*c
  }

  def quadraticFormula(a: Int, b: Int, c: Int): List[Double] = {
    val d = discriminant(a,b,c)
    // if there is 1 root, return it as a singleton list
    if ( d == 0)
      List( -b / (2.0*a))
    // if there are no roots, return an empty list
    else if (d < 0)
      List()
    // if there are 2 roots, return a list of them in increasing order
    else if (a < 0)
      List((-b + sqrt(d)) / (2.0 * a),
           (-b - sqrt(d)) / (2.0 * a))
    else
      List((-b - sqrt(d)) / (2.0 * a),
           (-b + sqrt(d)) / (2.0 * a))
  }


  

}

