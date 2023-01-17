import java.io.*;

public class CreateRandomAccessFile
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
      /* Record Format
         30 character string -> 60 bytes
         int                 ->  4 bytes
         double              ->  8 bytes */
      FileReader fr = new FileReader("fake_student_data.csv");
      BufferedReader in = new BufferedReader(fr);
      RandomAccessFile raFile = new RandomAccessFile("random_access_file_students.bin", "rw");
      int maxLength = 0;
      String line = in.readLine();
         
      while(line != null)
      {
            // Process line, in this case we just print the line.
            // System.out.println(line);
            String[] lineParts = line.split(",");
            //if(lineParts[0].length() > maxLength)
            //   maxLength = lineParts[0].length();
            raFile.writeChars(String.format("%30s",lineParts[0]));
            raFile.writeInt(Integer.parseInt(lineParts[1]));
            raFile.writeDouble(Double.parseDouble(lineParts[2]));
            line = in.readLine();
         }      
      System.out.println(maxLength);
   }   
}