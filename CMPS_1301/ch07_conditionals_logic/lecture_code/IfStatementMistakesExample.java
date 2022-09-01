import java.util.Scanner;

class IfStatementMistakesExample
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a whole number:  ");
      int number = in.nextInt();
      
      if( number > 5 )
      {
         System.out.println("The number is bigger than 5.");
         System.out.println("That's it for the first if statement.");
         System.out.println();
      }
      
      /* If the block of code after the if statement only consists of one
         line of code, then you do not have to put it in curly braces. */        
      if(number < 5)
         System.out.println("The number is less than 5.");
      
      /*  It is a common mistake to forget to put the curly braces around
          the code block following the if statement.  To fix this error,
          just put the curly braces around the code block. */   
      if( number == 5 )
         System.out.println();
         System.out.println("The number is equal to 5.");
         System.out.println();
         System.out.println("I didn't put this code block in curly braces, so \n" +
            "this line will get printed every single time the program is run.");
      /*  It is a common mistake to put a semi-colon after the if statement.
          To fix this error, just remove the semi-colon. */
                
      if( number !=5 );
      {
         System.out.println();
         System.out.println("The number is not equal to 5.");
         System.out.println();
         System.out.println("I accidentally put a semi-colon at the end of the ");
         System.out.println("end of the if statement, so this code block will ");
         System.out.println("get executed every single time the program is run.");
      }
                     
   }
}