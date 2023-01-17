import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample
{
   public static void main(String[] args)
   {
      try(FileWriter fw = new FileWriter("buffered_writer_output_file.txt");
          BufferedWriter out = new BufferedWriter(fw))
      {
         // Write or append text to the file.
         out.write("This is line of text.\n");
         out.write("This is another line of text.\n");
         out.append("This is yet another line of text.\n");
      }
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s", e.getMessage());
      }
   }
}