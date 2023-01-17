// Fix this code by handling the checked exception.
  
import java.util.Scanner;
import java.io.IOException;

public class ExceptionHandlingPracticeProblem5
{
   public static void main(String[] args)
   {       
      Scanner in = new Scanner(System.in);
      try
      {
         Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
      }
      catch(IOException e)
      {
         System.out.println("Command not found. Terminating program.");
         System.exit(0);
      } 
      
      System.out.print("Enter your name:  ");
      String name = in.nextLine();
      System.out.println("Hello " + name + "!");         
   }
}