class EmptyStringVsNullStringExample
{
   public static void main(String[] args)
   {
      String s1 = ""; // s1 is the empty string
      String s2 = null; // s2 is a null string
      
      /* The array of Strings below does not get initialized 
         so all of the strings in the array are null strings. */ 
      String[] strings = new String[5];
     
      // No problems are caused by the empty string. 
      System.out.println("s1.length():  " + s1.length() );
      
      /* Since s2 and all of the strings in the array are null,
         either of the following statements will cause a 
         run-time error if uncommented */
         
      //System.out.println( s2.length() ); 
      //System.out.println( strings[0].length() ); 
      
      // Again no problems with the empty string.
      System.out.println("s1.toUpperCase():  " + s1.toUpperCase() );
      
      /* Since s2 and all of the strings in the array are null,
         either of the folllowing statements will cause a 
         run-time error if uncommented */
               
      //System.out.println( s2.toUpperCase() );
      //System.out.println( strings[0].toUpperCase() ); 
     
      
      
                     
   }
}