import java.util.Scanner;

public class UncheckedExceptionExample
{
   public static void main(String[] args)
   {
      String[] names = {"Alice", "Bob", "Carlos", "Dario"};
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an index number:  ");
      int index = in.nextInt();
      if(index >= 0 && index < names.length)
      {
         System.out.printf("The name at index %d is %s.", index,
            names[index]);
      }
      else
      {
         System.out.print("Invalid index.");
      }
   }   
}