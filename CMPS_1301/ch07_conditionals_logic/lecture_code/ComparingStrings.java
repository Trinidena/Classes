import javax.swing.JOptionPane;

/**
* This example shows that using the relational
* operator == to compare Strings can cause unexpected
* results.  Unless you have a good reason otherwise,
* you should use the equals() method to compare Strings.
*/
class ComparingStrings
{
   public static void main(String[] args)
   {
      /* Enter whatever in the dialog box to trigger 
         unexpected results. */
      String var1 = JOptionPane.showInputDialog("Enter a string.");
      String var2 = "whatever";
      
      /* The following line gives unexpected results
         if the user enters whatever in the dialog box.
         Usually, you should not use == to compare Strings. */
      System.out.println( var1 == "whatever" );

      /* The following line gives unexpected results
         if the user enters whatever in the dialog box.
         Usually, you should not use == to compare Strings. */      
      System.out.println( var1 == var2 );
      
      /*  Use the equals() method to compare two Strings
          unless you have a good reason to do otherwise. */      
      System.out.println( var1.equals(var2) );
   }
}