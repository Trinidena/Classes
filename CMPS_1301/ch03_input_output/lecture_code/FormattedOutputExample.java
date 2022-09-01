import javax.swing.JOptionPane;

public class FormattedOutputExample
{
   public static void main(String[] args)
   {
      /* NOTE: The %n is a generalized new line character.  It works
         the same way as \n does, but %n will correctly on more 
         systems than \n will, leading to greater compatibility.*/ 
   
      // ****** String Examples *******
      String word = "alpha";

      // Unformatted output using print() or println().
      System.out.println("The word is " + word + ".");
      
      /* Formatted version of the previous statement
         The format specifier for type String is %s. */                 
      System.out.printf("The word is %s.%n", word);
      
      /* The field width is set to 10.  The value of the variable word will be 
         padded with blanks and right justified if its length is less than 10. */  
      System.out.printf("The word is %10s.%n", word);

      /* The left justification flag is set and field width is set to 10.  The value 
         of the variable word will be padded with blanks and left justified if 
         its length is less than 10. */
      System.out.printf("The word is %-10s.%n", word);            
      
      // The precision parameter can be used to extract substrings of strings.
      System.out.printf("The word is %.3s.%n", word);

      // A capital S can be used to display a String in all uppercase.
      System.out.printf("The word is %S.%n", word);
                  
      System.out.println();
      
      // ****** Integer Examples *******
      int int1 = 3467;

      // Unformatted output using print() or println().      
      System.out.println("The int is " + int1 + ".");
      
      /* Formatted version of the previous statement
         The format specifier for types byte, short, int, or long
         is %d. */      
      System.out.printf("The int is %d.%n", int1);
      
      /* The field width is set to 10.  The value of the variable int1 will be 
         padded with blanks and right justified if its length is less than 10. */      
      System.out.printf("The int is %10d.%n", int1);
      
      /* The field width is set to 10.  The value of the variable int will be 
         padded with blanks and right justified if its length is less than 10. */      
      System.out.printf("The int is %-10d.%n", int1);
      
      // Put a plus sign in front of the integer if it is positive. 
      System.out.printf("The int is %+d.%n", int1);
      
      // Use a comma grouping separator for numbers > 1000.
      System.out.printf("The int is %,d.%n", int1);
      
      // Pad the number with zeros instead of blanks.
      System.out.printf("The int is %010d.%n", int1);
      
      System.out.println();
      
      // ****** Floating Point Examples *******                                           
      double number = 5234.546;
      
      // Unformatted output using print() or println()
      System.out.println("The number is " + number + "."); 
      
      /* Formatted version of the previous statement
         The format specifier for type float or double is %f.*/
      System.out.printf("The number is %f.%n", number);

      /* The field width is set to 15.  The value of the variable number will be 
         padded with blanks and right justified if its length is less than 10. */      
      System.out.printf("The number is %15f.%n", number);
      
      /* The field width is set to 10.  The value of the variable number will be 
         padded with blanks and right justified if its length is less than 10. */      
      System.out.printf("The number is %-15f.%n", number);
      
      // Put a plus sign in front of the number if it is positive. 
      System.out.printf("The number is %+f.%n", number);
      
      // Use a comma grouping separator for numbers > 1000.
      System.out.printf("The number is %,f.%n", number);
      
      // Pad the number with zeros instead of blanks.
      System.out.printf("The number is %015f.%n", number);

      System.out.println(); 
                  
      System.out.printf("The number rounded to 0 decimal places is:  %.0f%n", number);
      System.out.printf("The number rounded to 1 decimal place is:  %.1f%n", number);
      System.out.printf("The number rounded to 2 decimal places is:  %.2f%n", number);
      System.out.printf("The number rounded to 3 decimal places is:  %.3f%n", number);
      
      System.out.println();
      
      // ****** Multiple Format Specifier Example *******  
           
      /* Multiple format specifiers can be placed in a string.  After the string
         you must supply a value or variable for each format specifier. */   
      System.out.printf("Code name %-7s owes Agent %06d $%,.2f.%n", word, int1, number);
      
      // ****** Formatted Output for JOptionPane *******
         
      /* For dialog box output, use the format method in the String class.  It works
         similar to the printf method. */
      JOptionPane.showMessageDialog(null, String.format("Code name %-7s owes Agent %06d $%,.2f.%n", 
         word, int1, number));                    
   }
}