import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample
{
   public static void main(String[] args)
   {
      try
      {
         FileReader fr = new FileReader("words.txt");
         BufferedReader br = new BufferedReader(fr);
         String word = br.readLine();
         System.out.println(word);
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found.  Terminating program.");
         System.exit(0);
      }
      catch(IOException e)
      {
         System.out.println("Error reading file.  Terminating program.");
         System.exit(0);
      }
   }
}