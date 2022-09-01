/* 2.  Create a class named Exponent.  Its main() method accepts an 
integer value from a user at the keyboard, and in turn passes the 
value to a method that returns the square of the number and to a 
method that returns the cube of the number.  The cubing method should 
compute the cube of the number by calling the square method and then
 multiplying that result by the number again.  The main method should 
 display the results to the user. */

import javax.swing.JOptionPane;

class Exponent
{
   public static void main(String[] args)
   {
      String numberString = JOptionPane.showInputDialog("Enter an integer.");
      int number = Integer.parseInt(numberString);
      int square = squareNumber(number);
      int cube = cubeNumber(number);
      JOptionPane.showMessageDialog(null,
         String.format("The square of %d is %d.  The cube of %d is %d.", number, square, number, cube));
      
      
   }
   
   public static int squareNumber(int x)
   {
      int square = x * x;
      return square;
   }
   
   public static int cubeNumber(int x)
   {
      int cube = squareNumber(x) * x;
      return cube;
   }
}
 