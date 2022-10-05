import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Assignment6
{
   public static void main(String[] args) throws FileNotFoundException
   {  
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a file name.");
      String fileName = in.nextLine(); //
      System.out.println("Enter as many words as you want. Enter \"end\" to terminate input.");
      
      String out = ""; //
      int count = 0;
      
      while(true)
      {
         String word = in.nextLine();
         
         if(word.equals("end"))
         {
            break;
         }
         out = out + word;
         count++;
      }
      
      System.out.println(out);
            
      try (FileWriter output = new FileWriter(fileName); //
           FileWriter answer = new FileWriter("answer.txt");
           FileReader input = new FileReader(fileName))
      { 
         output.write(out); //
            
         int nextCharacter = input.read(); ////
                  
         while(nextCharacter != -1) ////
         {
            System.out.print((char)nextCharacter);
            nextCharacter = input.read();
            count = count++;
         }
         answer.write(String.valueOf(count));
      }
      
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s%n", e.getMessage());        
      }
   }
}
