import java.util.Scanner;

class DoWhileLoop
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      // A do-while loop that validates user input.
      //
      // Loop 1
      
      int number = 0; // Declare and initialize loop variable.
      
      do
      {
         System.out.println("Loop 1:  Enter a positive whole number.");
         number = in.nextInt();  // Change loop variable inside loop body.
      }
      while( number < 1 );
      
      System.out.printf("Loop 1:  You entered %d.%n%n", number); 
     
      // Here is the do while loop above rewritten as a while loop.
      //
      // Loop 2

      System.out.println("Loop 2:  Enter a positive whole number.");
      number = in.nextInt(); // Initialize loop variable.
      
      while( number < 1 )
      {
         System.out.println("Loop 2:  Enter a positive whole number.");
         number = in.nextInt();  // Change loop variable inside loop body.         
      }
      
      System.out.printf("Loop 2:  You entered %d.%n%n", number);             

      // Here is the do while loop above rewritten as a while loop.
      //
      // Loop 3
      
      number = 0;
      
      while( number < 1 )
      {
         System.out.println("Loop 3:  Enter a positive whole number.");
         number = in.nextInt();  // Change loop variable inside loop body.         
      }
      
      System.out.printf("Loop 3:  You entered %d.%n%n", number);               
   }
}