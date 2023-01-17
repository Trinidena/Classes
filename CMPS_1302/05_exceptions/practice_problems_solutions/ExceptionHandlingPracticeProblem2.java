/* Fix this code by handling the exceptions that occur when
   a user enters non-numeric input, non-integer input, or
   0 for the divisor.
   
   IMPORTANT NOTE:  The ArithmeticException that occurs 
   in this program results from really bad program design.  
   
   In reality, the issue with this problem should not be 
   fixed with exception handling, but by using an if 
   statement to check if the divisor is 0 before 
   actually dividing.
   
   The ArithmeticException thrown by this program is a 
   subclass of RunTimeException which is unchecked. In
   practice, you should try to fix unchecked exceptions 
   by changing the code and not by exception handling. */   
  
import java.util.Scanner;

public class ExceptionHandlingPracticeProblem2
{
   public static void main(String[] args)
   {   
      Scanner in = new Scanner(System.in); 
      
      System.out.println("\nInteger Division Calculator");
      System.out.println("---------------------------\n");
            
      System.out.println("Enter the dividend.");
      int dividend = in.nextInt();
      
      System.out.println("Enter the divisor.");
      int divisor = in.nextInt();

      int quotient = 0;
      
      try
      {
         quotient = dividend / divisor;
      }
      catch(ArithmeticException e)
      {
         System.out.println("You cannot divide by zero.");
         System.exit(0);
      }
      
      System.out.printf("The integer quotient of %d and %d is %d.%n",
         dividend, divisor, quotient);      
   }
}