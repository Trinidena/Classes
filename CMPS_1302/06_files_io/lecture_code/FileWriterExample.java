import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample
{
   public static void main(String[] args)
   {
      try(FileWriter out = new FileWriter("file_writer.txt"))
      {
         // write will overwrite the existing file.
         out.write("File writer example Line 1.\n");
         out.write("File writer example Line 2.\n");
         out.write("File writer example Line 3.\n");
         
         // append will add to the end of the existing file.
         out.append("File writer example Line 4.\n");
      }
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s", e.getMessage());      
      }
   }   
}