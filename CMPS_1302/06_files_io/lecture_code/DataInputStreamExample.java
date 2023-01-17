import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample
{
   public static void main(String[] args)
   {  
      // Create FileInputStream and DataInputStream objects.
      try(FileInputStream fis = new FileInputStream("output.bin");
          DataInputStream dis = new DataInputStream(fis);)
      {
         for(int i = 0; i < 3; i++)
         {
            /* Use the read methods of the DataInputStream object to read the
               line and process it.  In this case, we just print the line. */
            System.out.printf("%-15s %3d %6.2f%n", dis.readUTF(), dis.readInt(), dis.readDouble());
         }            
      }
      catch(IOException e)
      {
         e.printStackTrace(); 
      }      
   }
}