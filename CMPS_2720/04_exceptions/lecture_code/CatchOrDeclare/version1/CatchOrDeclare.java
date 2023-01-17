import java.io.*;

public class CatchOrDeclare
{
   public static void main(String[] args)   {
      catchExample();
      try
      {
         declareExample();
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found!");
      }     
   }
   
   public static void catchExample()
   {
      try
      {
         FileReader fr = new FileReader("words.txt"); 
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found!");
      }     
   }
   
   public static void declareExample() throws FileNotFoundException
   {
      FileReader fr = new FileReader("words.txt");
   }
}