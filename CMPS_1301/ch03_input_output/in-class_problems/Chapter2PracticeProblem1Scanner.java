/* Change the program so that the user enters the value of tempC.
   Use Scanner.  Display the results rounded to three decimal places */
import java.util.Scanner;
   
public class Chapter2PracticeProblem1Scanner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the temperature in Celsius.");
      double tempC = in.nextDouble();
      
      double tempF = 9.0 * tempC / 5.0 + 32.0;
      
      System.out.printf("%.3f degrees Celsius is %.3f" +
         " degrees Fahrenheit.", tempC, tempF);
   }
}