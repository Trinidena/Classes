import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** This class uses FileInputStream and FileOutputStream
*   to make a copy of the 1234.jpg file.  
*/
public class FileInputOutputStreamExample
{
   public static void main(String[] args)
   {
      /* See TryWithResources.java.  This example does not
         use try with resources because I want to provide at
         least one example without try with resources.  From 
         here on out, all examples will use try with resources. 
      */
      
      FileInputStream in = null;
      FileOutputStream out = null;
         
      try
      {
         // Create a FileInputStream object.
         in = new FileInputStream("1234.jpg");
         // Create a FileOutputStream object.
         out = new FileOutputStream("1234_copy.jpg");
         
         // Read the first byte from the input file.
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
      finally
      {
         // Ugh.  Use try with resources.
         
         // Close the input file.
         if(in != null)
         {
            try
            {
               // Close the input file.
               in.close();
            }
            catch(IOException e)
            {
               System.out.printf("IO Exception:  %s%n", e.getMessage());               
            }   
         } 
         
         // Close the output file.
         if(out != null)
         {
            try
            {
               out.close();
            }
            catch(IOException e)
            {
               System.out.printf("IO Exception:  %s%n", e.getMessage());               
            }   
         }                 
      }       
   }
}