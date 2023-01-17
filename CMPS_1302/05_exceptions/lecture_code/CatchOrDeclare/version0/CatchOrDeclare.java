import java.io.*;

public class CatchOrDeclare
{
   public static void main(String[] args)
   {
      catchExample();
      declareExample();    
   }
   
   public static void catchExample()
   {
      FileReader fr = new FileReader("words.txt");     
   }
   
   public static void declareExample()
   {
      FileReader fr = new FileReader("words.txt");
   }
}