import java.io.*;
import java.util.*;

public class WordAnalyzer
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the file name.");
      String fileName = in.nextLine();
      Map<String, Integer> map = new HashMap<String, Integer>();
      try(FileReader fr = new FileReader(fileName);
          BufferedReader br = new BufferedReader(fr))
      {
         String line = br.readLine();
         
         while(line != null)
         {
            //System.out.println(line);
            String[] words = line.split(" ");
            
            for(String word : words)
            {
               if(map.containsKey(word))
               {
                  map.replace(word, map.get(word) + 1);
               }
               else
               {
                  map.put(word, 1);
               }
            }
            
            //System.out.println(Arrays.toString(words));
            line = br.readLine();
         }
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found.");
         return;
      }
      catch(IOException e)
      {
         System.out.printf("IOException: %s", e.getMessage());
         return;
      }
          
      System.out.println(map.get("was"));
      System.out.println(map.get("incredulity,"));
   }
}