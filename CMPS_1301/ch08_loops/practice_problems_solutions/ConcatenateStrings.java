import java.util.Scanner;

public class ConcatenateStrings
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string on each line.  Enter \"end\" to terminate input.");
      
      String outString = "\n";
      String currentString = "";
      
      while(!currentString.equals("end"))
      {
         outString = outString + currentString;
         currentString = in.nextLine();
      }
      
      System.out.println(outString);
   }
}