/* 1.  Create a class named Eggs.  Its main() method holds an integer 
variable named numberOfEggs to which you will assign a value entered 
by a user at the keyboard.  Create a method to which you pass numberOfEggs.  
The method should return the number of eggs in dozens, ignoring any leftover 
eggs.  For instance 50 eggs would give 4 dozens.  The main method should 
print the results to the screen. */

import java.util.Scanner;

class Eggs
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of eggs.");
      int numberOfEggs = in.nextInt();
      int numberOfDozens = convertToDozens(numberOfEggs);
      System.out.println( numberOfEggs + " eggs gives " + numberOfDozens + " dozens.");
  }
  
  public static int convertToDozens(int eggs)
  {
      int dozens = eggs / 12;
      return dozens;
  } 
}