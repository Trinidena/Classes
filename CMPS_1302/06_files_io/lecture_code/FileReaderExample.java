import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample
{
   public static void main(String[] args)
   {
      try(FileReader in = new FileReader("alpha.txt"))
      {
         int nextCharacter = in.read();
         while(nextCharacter != -1)
         {
            System.out.print((char)nextCharacter);
            nextCharacter = in.read();
         }
      }
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s", e.getMessage());      
      }
   }   
}