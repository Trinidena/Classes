import java.util.Scanner;
import java.io.*;

public class Assignment6
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {  
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a file name.");
      
      String fileName = in.nextLine(); // 
      
      System.out.println("Enter the word you want to count.");
      
      String value = in.nextLine(); //
            
      System.out.println("You want to count \"" + value + "\".\n");
            
      try (FileWriter answer = new FileWriter("answer.txt");
           FileReader input = new FileReader(fileName);
           BufferedReader br = new BufferedReader(input))
      { 
         String line = br.readLine();
         int count = 0;
         while(line != null)
         {
            System.out.print(line);
            for(int i = 0; i < line.length() - value.length(); i++)
            {
               {
                  if(line.substring(i , i + value.length()).contains(value))
                  {
                     count++;
                  }
               }
            }
            line = br.readLine();
            System.out.println();
            System.out.println(value + " has appeared " + count + " time(s)\n");
         }
         answer.write(String.valueOf(count));
      }
   }
}