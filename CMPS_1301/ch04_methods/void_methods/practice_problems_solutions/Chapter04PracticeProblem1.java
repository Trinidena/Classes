import java.util.Scanner;

public class Chapter04PracticeProblem1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter your name:  ");
      String name = in.nextLine();
      
      System.out.println("Enter a whole number:  ");
      int number = in.nextInt();
      
      displayNameNumber(name, number);
   }
   
   public static void displayNameNumber(String name, int num)
   {
      System.out.println("Hi " + name + ".  You entered the number " +
         num + ".");
   }   
}