import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class CopyFile
{
   public static void main(String[] args)
   {
      try(FileInputStream fr = new FileInputStream("1234.jpg");
          FileOutputStream fw = new FileOutputStream("1234copy.jpg"))
      { 
         int value = fr.read();
         while(value != -1)
         {
            //System.out.println(value);
            fw.write(value);
            value = fr.read();
         }
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found!");
      }
      catch(IOException e)
      {
         System.out.println("IOException occured");
      }
   }
}