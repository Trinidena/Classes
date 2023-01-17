import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** This class uses FileInputStream and FileOutputStream, 
*   along with try with resources to make a copy of the 
*   1234.jpg file.  
*/
public class TryWithResources
{
   public static void main(String[] args)
   {  
      try(FileInputStream in = new FileInputStream("1234.jpg");
          FileOutputStream out = new FileOutputStream("1234_copy_2.jpg"))
      {                  
         // Read a byte from the input file.
         int nextByte = in.read();
         
         while(nextByte != -1) // nextByte will be -1 at the end of the file (EOF)
         {  
            // Write the byte that was just read.
            out.write(nextByte);
            
            // Read the next byte.
            nextByte = in.read();
         }
      }
      catch(FileNotFoundException e)
      {
         System.out.printf("File Not Found:  %s%n", e.getMessage());
      }
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s%n", e.getMessage());        
      }      
   }
}