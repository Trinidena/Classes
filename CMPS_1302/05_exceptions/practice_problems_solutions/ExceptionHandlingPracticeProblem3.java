/* Fix this code by handling the exceptions that occur.

   IMPORTANT NOTE:  The purpose of this program is only to
   provide a practice problem for exception handling.
   
   The exception that occurs in this program 
   results from really bad program design.  
   
   In reality, the issue with this problem should not be 
   fixed with exception handling, but by placing the 
   statement if(words[i] != null) before the statement 
   that generates the exception.
   
   The NullPointerException thrown by this program is a 
   subclass of RunTimeException which is unchecked.  In
   practice, you should try to fix unchecked exceptions 
   by changing the code and not by exception handling. */
  
import java.util.Random;

public class ExceptionHandlingPracticeProblem3
{
   public static void main(String[] args)
   {  
      // Create an array of strings of length 100. 
      String[] words = new String[100];
      
      // Create a Random object.
      Random rnd = new Random();
      
      /* Fill some of the spots in the array with 
         random words. The spots not filled in
         will be null. */
      for(int i = 0; i < words.length; i++)
      {
         if( rnd.nextInt(10) < 4 )
         {
            words[i] = generateRandomWord();
         }
      }
      
      /* Print the lowercase version of the 
         strings in the array. */
      for(int i = 0; i < words.length; i++)
      {
         try
         {
            System.out.println( words[i].toLowerCase() );
         }
         catch(NullPointerException e)
         {
            System.out.println("Skipping a null value.");
         }   
      }          
   }
   
   public static String generateRandomWord()
   {
      // Create a Random object.
      Random prng = new Random();
      
      // Pick a random word length from 3 to 10.
      int wordLength = prng.nextInt(8)+3;
      
      /* Create an array of characters of length
         wordLength. */
      char[] word = new char[wordLength];
      
      // Fill array with random characters.
      for(int i = 0; i < word.length; i++)
      {
         word[i] = (char)( 'A'+prng.nextInt(26) );
      }
      
      // Return a string version of the char array.
      return new String(word);
   }
}