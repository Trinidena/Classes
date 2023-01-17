import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample
{
   public static void main(String[] args)
   {
      try(FileReader fr = new FileReader("alpha.txt");
          BufferedReader in = new BufferedReader(fr))
      {
         // Read the first line of the file.     
         String line = in.readLine();
         
         // If the line is null, then do not continue to read.
         while(line != null)
         {
            // Process line, in this case we just print the line.
            System.out.println(line);
            // Read another line.
            line = in.readLine();
         }
      }
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s", e.getMessage());
      }
   }
}