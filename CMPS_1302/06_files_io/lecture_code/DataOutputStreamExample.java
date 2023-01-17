import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample
{
   public static void main(String[] args)
   {
      /* In this example, the following example data is written to the 
         file output.bin:
         
         Catfish Hunter    5    8.93
         Placido Polanco -17  189.09
         Esteban Loiza   345  -38.0239     */
      
      /* Set up FileOutputStream and DataOutputStream objects inside
         try with resources */   
      try(FileOutputStream fos = new FileOutputStream("output.bin");
          DataOutputStream dos = new DataOutputStream(fos);)
      {
         // Use the write methods of the DataOutputStream object.
         dos.writeUTF("Catfish Hunter");
         dos.writeInt(5);
         dos.writeDouble(8.93);
         dos.writeUTF("Placido Polanco");
         dos.writeInt(-17);
         dos.writeDouble(189.09);
         dos.writeUTF("Esteban Loiza");
         dos.writeInt(345);
         dos.writeDouble(-38.0239);            
      }
      catch(IOException e)
      {
         e.printStackTrace(); 
      }      
   }
}