import java.io.*;
import java.util.Scanner;

public class SequentialAccessFileDemo
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
      FileReader fr = new FileReader("fake_student_data.csv");
      BufferedReader seqFile = new BufferedReader(fr);
      Scanner in = new Scanner(System.in);
      int recordNumber = 0;
      while(recordNumber > -1)
      {
         System.out.print("Enter a record number (0-999) or -1 to quit:  ");
         try
         {
            recordNumber = in.nextInt();

            for(int i = 0; i < recordNumber - 1; i++)
            {
               seqFile.readLine();
            }
            System.out.printf("%s%n", seqFile.readLine());
         }
         catch(NullPointerException e)
         {
            System.out.println("Invalid input.  Try again.");
         }  
      }    
   }
}