/* The main method should call another method that 
converts the degrees in Celsius to Fahrenheit 
and returns the results to the main() method.  
The main method should display the results to 
the user.  The formula for the conversion is:

F=9/5C+32
Here is a sample run of the program:

Enter a degree in Celsius:  43
43.0 Celsius is 109.4 Fahrenheit */ 
import java.util.Scanner;

class TempConverter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter degrees in Celsius:  ");
      double tempC = in.nextDouble();
      
      System.out.printf("%.2f Celsius is %.2f Fahrenheit.", tempC,  
         convertTemp(tempC));
   }
   
   public static double convertTemp(double celsius)
   {
      double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
      return fahrenheit;
   }
}
