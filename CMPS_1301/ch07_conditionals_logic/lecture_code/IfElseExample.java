import java.util.Scanner;

class IfElseExample
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a whole number:  ");
      int number = in.nextInt();
   
      if( number % 3 == 0)
      {
         System.out.println("The number is a multiple of three.");
      }
      else
      {
         System.out.println("The number is not a multiple of three.");
      }
   }
}