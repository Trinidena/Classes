class StringMethodsExample
{
   public static void main(String[] args)
   {
      String string1 = "Some text.\n";      
      System.out.println("string1:  " + string1);     
      System.out.println("string1.indexOf(\"me\") : " + string1.indexOf("me") );
      System.out.println("string1.length() : " + string1.length() );
      System.out.println("string1.substring(3) : " + string1.substring(3) ); 
      System.out.println("string1.substring(2,8) : " + string1.substring(2,8) ); 
      System.out.println("string1.toLowerCase() : " + string1.toLowerCase() );      
      System.out.println("string1.toUpperCase() : " + string1.toUpperCase() );
      System.out.println("string1.charAt(9) : " + string1.charAt(9) );
      System.out.println("string1.concat(\"More text.\") : " + string1.concat("More text.") );
      System.out.println("string1.replace(\"e\",\"banana\") : " + string1.replace("e","banana") );                                  
   }
}