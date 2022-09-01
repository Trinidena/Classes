import java.util.Scanner;

class IfStatementExample
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a whole number:  ");
      int number = in.nextInt();
      
      if( number > 5 )
      {
         System.out.println("The number is bigger than 5.");
      }
              
      if(number < 3)
      {
         System.out.println("The number is less than 3.");
      }   
      
   
      if( number == 8 )
      {
         System.out.println("The number is equal to 8.");
      }
      
      System.out.println("The program is ending.");                     
   }
}