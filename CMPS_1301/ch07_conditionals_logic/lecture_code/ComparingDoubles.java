import java.math.BigDecimal;

/**
* This example shows that using the relational
* operator == to compare doubles can cause unexpected
* results.  Two other techinques for comparing doubles 
* are shown.
*/

class ComparingDoubles
{
   public static void main(String[] args)
   {
      double number = 2.2 - 2.0;     

      /* The following line gives unexpected results
         if the user enters whatever in the dialog box.
         Usually, you should not use == to compare Strings. */
               
      System.out.println( number == 0.2 );

      /* Why?  The computer can only represent finitely
         many real numbers, so some values are approximated. */
         
      // Look at how the computer stores 2.2-2.0 in number.
      System.out.println(number);  
      
      /* The following method of comparing doubles can be used in certain
         situations.  It will give true if the two numbers are 
         close together. */
         
      double tolerance = 0.00001;
      System.out.println( Math.abs(number - 0.2) < tolerance );
      
      /* The BigDecimal class represents decimal numbers more 
         precisely than double, but there is some overhead 
         associated with that. */    
 
      BigDecimal num = BigDecimal.valueOf(2.2).subtract(BigDecimal.valueOf(2.0)); 
      
      System.out.println(num.equals(BigDecimal.valueOf(0.2)));
      
      // Look at how the computer stores number3. 
      System.out.println(num);     
      
   }
}