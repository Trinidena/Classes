import java.util.Scanner; // Import the Scanner class.

/**
* This class shows the basic use of the Scanner class
* to capture input from the user via the console.
*/

class ScannerExample
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in); // Create a new Scanner object.
      
      System.out.println("Enter your name:  ");  // Prompt the user for input.
      
      /* The following statement uses the nextLine method in the Scanner object
         to retreive the next line entered from the keyboard and stores it 
         as a String in the variable name. */
         
      String name = in.nextLine(); 
      
      System.out.println("Enter a whole number: ");
      
      /* The following statement uses the nextInt method in the Scanner object
         to retreive the next int entered from the keyboard and stores it as
         an int in the variable wholeNumber. */
         
      int wholeNumber = in.nextInt();
      
      System.out.println("Enter a decimal number:  ");
      
      /* The following statement uses the nextDouble method in the Scanner object
         to retreive the next double entered from the keyboard and stores it as
         a decimal in the variable decimalNumber. */
         
      double decimalNumber = in.nextDouble();
      
      // This line just shows the values entered by the user.
      System.out.println("\nName:  " + name + "  Whole Number:  " + wholeNumber +
         "  Decimal Number:  " + decimalNumber);
   }
}