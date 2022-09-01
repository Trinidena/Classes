class CharacterClassExample
{  
   public static void main(String[] args)
   {
      char letter1 = 't';
      char letter2 = 'Y';
      char digit1 = '5';
      char whiteSpace1 = ' ';
      char whiteSpace2 = '\t';
      char whiteSpace3 = '\n';
      
      System.out.println("Testing output for character:  " + letter1);
      System.out.println("Is char letter1 uppercase?  " + Character.isUpperCase( letter1 ) );
      System.out.println("Is char letter1 lowercase?  " + Character.isLowerCase( letter1 ) ); 
      System.out.println("Is char letter1 a digit?  " + Character.isDigit( letter1 ) );
      System.out.println("Is char letter1 a letter?  " + Character.isLetter( letter1 ) );
      System.out.println("Is char letter1 a letter or digit?  " + Character.isLetterOrDigit( letter1 ) );
      System.out.println("Is char letter1 whiteSpace?  " + Character.isWhitespace( letter1 ) );
      
      System.out.println();

      System.out.println("Testing output for character:  " + letter2);
      System.out.println("Is char letter1 uppercase?  " + Character.isUpperCase( letter2 ) );
      System.out.println("Is char letter1 lowercase?  " + Character.isLowerCase( letter2 ) ); 
      System.out.println("Is char letter1 a digit?  " + Character.isDigit( letter2 ) );
      System.out.println("Is char letter1 a letter?  " + Character.isLetter( letter2 ) );
      System.out.println("Is char letter1 a letter or digit?  " + Character.isLetterOrDigit( letter2 ) );
      System.out.println("Is char letter1 whiteSpace?  " + Character.isWhitespace( letter2 ) );
      
      System.out.println();

      System.out.println("Testing output for character:  " + digit1);
      System.out.println("Is char letter1 uppercase?  " + Character.isUpperCase( digit1 ) );
      System.out.println("Is char letter1 lowercase?  " + Character.isLowerCase( digit1 ) ); 
      System.out.println("Is char letter1 a digit?  " + Character.isDigit( digit1 ) );
      System.out.println("Is char letter1 a letter?  " + Character.isLetter( digit1 ) );
      System.out.println("Is char letter1 a letter or digit?  " + Character.isLetterOrDigit( digit1 ) );
      System.out.println("Is char letter1 whiteSpace?  " + Character.isWhitespace( digit1 ) );
      
      System.out.println();

      System.out.println("Testing output for character:  ' '" + whiteSpace1);
      System.out.println("Is char letter1 uppercase?  " + Character.isUpperCase( whiteSpace1 ) );
      System.out.println("Is char letter1 lowercase?  " + Character.isLowerCase( whiteSpace1 ) ); 
      System.out.println("Is char letter1 a digit?  " + Character.isDigit( whiteSpace1 ) );
      System.out.println("Is char letter1 a letter?  " + Character.isLetter( whiteSpace1 ) );
      System.out.println("Is char letter1 a letter or digit?  " + Character.isLetterOrDigit( whiteSpace1 ) );
      System.out.println("Is char letter1 whiteSpace?  " + Character.isWhitespace( whiteSpace1 ) );
      
      System.out.println();

      System.out.println("Testing output for character:  '\\t'");
      System.out.println("Is char letter1 uppercase?  " + Character.isUpperCase( whiteSpace2 ) );
      System.out.println("Is char letter1 lowercase?  " + Character.isLowerCase( whiteSpace2 ) ); 
      System.out.println("Is char letter1 a digit?  " + Character.isDigit( whiteSpace2 ) );
      System.out.println("Is char letter1 a letter?  " + Character.isLetter( whiteSpace2 ) );
      System.out.println("Is char letter1 a letter or digit?  " + Character.isLetterOrDigit( whiteSpace2 ) );
      System.out.println("Is char letter1 whiteSpace?  " + Character.isWhitespace( whiteSpace2 ) );
      
      System.out.println();

      System.out.println("Testing output for character:  '\\n'");
      System.out.println("Is char letter1 uppercase?  " + Character.isUpperCase( whiteSpace3 ) );
      System.out.println("Is char letter1 lowercase?  " + Character.isLowerCase( whiteSpace3 ) ); 
      System.out.println("Is char letter1 a digit?  " + Character.isDigit( whiteSpace3 ) );
      System.out.println("Is char letter1 a letter?  " + Character.isLetter( whiteSpace3 ) );
      System.out.println("Is char letter1 a letter or digit?  " + Character.isLetterOrDigit( whiteSpace3 ) );
      System.out.println("Is char letter1 whiteSpace?  " + Character.isWhitespace( whiteSpace3) );
      
      System.out.println();

      System.out.println("letter1:  " + letter1); 
      letter1 = Character.toUpperCase( letter1 );
      System.out.println("letter1 after toUpperCase():  " + letter1 ); 
      
      System.out.println();
      
      System.out.println("letter2:  " + letter2); 
      letter2 = Character.toLowerCase( letter2 );
      System.out.println("letter2 after toLowerCase():  " + letter2 );            
   }
}