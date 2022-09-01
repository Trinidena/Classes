/**
* This example shows that using the relational
* operator == to compare Strings can cause unexpected
* results.  Unless you have a good reason otherwise,
* you should use the equals() method to compare Strings.
*/

class ComparingStringsPartTwo
{
   public static void main(String[] args)
   {
      String word1 = new String("whatever");
      String word2 = new String("whatever");
      
      System.out.println("Recall that comparing strings with == is not reliable.");
      System.out.println("------------------------------------------------------");
      System.out.println("word1:  " + word1);
      System.out.println("word2:  " + word2);
      System.out.println("Memory address of word1:  " + 
         Integer.toHexString(System.identityHashCode( word1 )) );
      System.out.println("Memory address of word2:  " + 
         Integer.toHexString(System.identityHashCode( word2 )) );         
      System.out.println("Result of word1 == word2 :  " + (word1 == word2) );
      System.out.println("Result of word1.equals(word2) :  " + ( word1.equals(word2)) );
      System.out.println();
      System.out.println("Use the equals() method to compare two strings.");
      System.out.println();
      
      String s1 = "boomerang";
      String s2 = "bOoMeRaNg";
      String s3 = "boom";
      String s4 = "rang";
      String s5 = "mera"; 
      
      System.out.println("s1 : " + s1);
      System.out.println("s2 : " + s2);
      System.out.println("s3 : " + s3);
      System.out.println("s4 : " + s4);
      System.out.println("s5 : " + s5);
      System.out.println();
      System.out.println("s1.compareTo(s3) : " +  s1.compareTo(s3));
      System.out.println("s1.compareTo(s1) : " +  s1.compareTo(s1));
      System.out.println("s3.compareTo(s5) : " +  s3.compareTo(s5));
      System.out.println("s1.equalsIgnoreCase(s2) : " +  s1.equalsIgnoreCase(s2)); 
      System.out.println("s1.startsWith(s3) : " +  s1.startsWith(s3)); 
      System.out.println("s1.endsWith(s4) : " +  s1.endsWith(s4));
      System.out.println("s1.contains(s5) : " +  s1.contains(s5));                                           
   }
}