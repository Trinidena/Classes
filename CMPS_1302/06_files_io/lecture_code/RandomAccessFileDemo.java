import java.io.*;
import java.util.Scanner;

public class RandomAccessFileDemo
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
      RandomAccessFile raFile = new RandomAccessFile("random_access_file_students.bin", "r");
      Scanner in = new Scanner(System.in);
      int recordNumber = 0;
      while(recordNumber > -1)
      {
         System.out.print("Enter a record number (0-999) or -1 to quit:  ");
         try
         {
            recordNumber = in.nextInt();
            raFile.seek(recordNumber * 72L);
            char[] charArray = new char[30];
            for(int i = 0; i < 30; i++)
            {
               charArray[i] = raFile.readChar();
            }
            System.out.printf("%s %d %f%n", new String(charArray), raFile.readInt(), raFile.readDouble());
         }
         catch(NullPointerException e)
         {
            System.out.println("Invalid input.  Try again.");
         }  
      }    
   }
}