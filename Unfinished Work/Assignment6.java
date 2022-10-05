<<<<<<< HEAD
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
      
      String word = in.nextLine();
         
      out = out + word;
            
      System.out.println(out);
            
      try (//FileWriter output = new FileWriter(fileName); //
           FileWriter answer = new FileWriter("answer.txt");
           FileReader input = new FileReader(fileName);
           BufferedReader br = new BufferedReader(input))
      { 
         //output.write(out); //
            
         String nextCharacter = br.readLine(); ////
                  
         while(nextCharacter != null) ////
         {
            System.out.print(nextCharacter);
            nextCharacter = br.readLine();
            count = count++;
         }
         answer.write(String.valueOf(count));
      }
      
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s%n", e.getMessage());        
      }
   }
=======
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
      
      String word = in.nextLine();
         
      out = out + word;
            
      System.out.println(out);
            
      try (//FileWriter output = new FileWriter(fileName); //
           FileWriter answer = new FileWriter("answer.txt");
           FileReader input = new FileReader(fileName);
           BufferedReader br = new BufferedReader(input))
      { 
         //output.write(out); //
            
         String nextCharacter = br.readLine(); ////
                  
         while(nextCharacter != null) ////
         {
            System.out.print(nextCharacter);
            nextCharacter = br.readLine();
            count = count++;
         }
         answer.write(String.valueOf(count));
      }
      
      catch(IOException e)
      {
         System.out.printf("IO Exception:  %s%n", e.getMessage());        
      }
   }
>>>>>>> refs/remotes/origin/main
}