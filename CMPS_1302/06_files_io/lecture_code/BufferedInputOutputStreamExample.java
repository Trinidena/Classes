import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamExample
{
   public static void main(String[] args)
   {
      try(FileInputStream fis = new FileInputStream("1234.jpg");
          BufferedInputStream in = new BufferedInputStream(fis);
          FileOutputStream fos = new FileOutputStream("1234_buffered_copy.jpg");
          BufferedOutputStream out = new BufferedOutputStream(fos))
      {
         int nextByte = in.read();
         while(nextByte != -1)
         {
            out.write(nextByte);
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