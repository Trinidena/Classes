import java.util.Scanner;

class WhileLoopExample
{
   public static void main(String[] args)
   {
      // Count up by ones.
      
      int n = 1;  // Initialize variable that will control the loop.
           
      while( n < 5 )
      {
         System.out.printf("7 raised to the power %d is %.0f.%n", n, Math.pow(7,n) );
         
         n = n + 1; // Change loop variable inside loop body.
      }
      
      System.out.println();
      
      // Countdown from 12 by threes.
      
      n = 12;  // Initialize variable that will control the loop.
      
      while( n > -1 )
      {
         System.out.printf("Countdown:  %d%n", n);
         
         n = n - 3;  // Change loop variable inside loop body.
      }
      
      System.out.println();
            
      /* In the next example, a while loop is used to validate 
         user input.  We have no idea how many times it might
         take a user to type in valid input, so a while or 
         do while loop has to be used. */
         
      Scanner in = new Scanner(System.in);
      
      System.out.println("\nEnter a whole number.");
      
      while(!in.hasNextInt())  // True if user enters input that is not a whole number.
      {
         String badInput = in.nextLine(); // Captures bad input as String.
         System.out.printf("%s is not a whole number.%n%nEnter a whole number.%n%n", badInput);
      }
      
      int goodInput = in.nextInt();
      System.out.printf("You entered %d.%n", goodInput);
      
      // Common Mistake:  Infinite Loop
      // Forgetting to alter loop variable inside loop body.
      // Uncomment the following lines for infinite loop example.
      
      /* n = 0;
      
      // while( n < 10 )
      {
         //System.out.printf("The variable n is equal to %d.%n", n);
                    // Loop variable not altered in loop body!  Fix this.
      } */     
   }
}