/**
* This class shows how to declare and 
* call methods in your programs.
*/
class VoidMethodsExample
{
   public static void main(String[] args)
   {
		System.out.println("This program is starting.");
      
      /* The next statement is a method call to the 
         printSomeText method.  The printSomeText method
         has no parameters, so there are no arguments
         in the method call. */
               
      printSomeText();  
      
      System.out.println("Not too bad.");

      /* The next statement is a method call to the 
         printNumber method.  The printNumber method
         has one parameters, so there must be one argument
         of the correct type in the method call. */
               
      printNumber(8);
      
      System.out.println("Ok, so far so good.");
      
      /* Just declaring a variable to use in the next
         method call to show that variables can be
         used in method calls. */
         
      double aVar = 5.76;  

      /* The next statement is a method call to the 
         printProduct method.  The printProduct method
         has two parameters, so there must be two arguments
         of the correct types in the method call. */
         
      printProduct(-3, aVar);
      
      System.out.println("Ok, all done.");      
   }
   
   /**
    * This method just prints some text.  It has
    * no parameters.
    */
   public static void printSomeText()
   {
      System.out.println("This is some text.");
   }
   
   /**
   * This method prints some text describing
   * a number.  It has one parameter, num.
   *
   * @param num an integer
   */
   public static void printNumber(int num)
	{
		System.out.println("The number is " + num + ".");
	}

   /**
   * This method computes the product of two
   * numbers and displays the results.  It has
   * two parameters, num1 and num2.
   *
   * @param num1 an integer
   * @param num2 a double
   */   
   public static void printProduct(int num1, double num2)
	{
		System.out.println("The product of " + num1 + " and " +
		     num2 + " is " + (num1 * num2) + ".");
	}
}