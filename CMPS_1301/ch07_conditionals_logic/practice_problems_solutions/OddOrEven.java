import java.util.Scanner;

class Chapter07PracticeProblem1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter an integer.");
      
      int number = in.nextInt();

      if( number % 2 == 0 )
      {
         System.out.printf("The number %d is even.%n", number);
      }
      else
      {
         System.out.printf("The number %d is odd.%n", number);         
      }      
   }
}