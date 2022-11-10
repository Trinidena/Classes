import java.util.*;
import java.io.*;
import java.net.*;

public class WordSearch
{
   public static void main(String[] args) throws MalformedURLException , IOException
   {
      ArrayList<String> words = new ArrayList<>();
      
      URL url = new URL("https://www.mit.edu/~ecprice/wordlist.10000");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine = in.readLine();
      while(inputLine != null)
      {
         words.add(inputLine);
         inputLine = in.readLine();
      }
      Collections.shuffle(words);
      System.out.println(words);
      
      OrderedList<String> list = new OrderedList<>();
      for(String word : words)
      {
         list.insert(word);
      }
      System.out.println(list);
      
      long startTime = 0;
      long endTime = 0;
      
      startTime = System.nanoTime();
      for(String word : words)
      {
         System.out.println(list.sequentialSearch(word));
      }
      endTime = System.nanoTime();
      long seqElapsedTime = (endTime - startTime) / 1000000;
      
      
      startTime = System.nanoTime();
      for(String word : words)
      {
      System.out.println(list.binarySearch(word));
      }
      endTime = System.nanoTime();
      long elapsedTime = (endTime - startTime) / 1000000;
      System.out.printf("Time for binary search in milliseconds: %d%n" , elapsedTime);
      System.out.printf("Time for sequential search in milliseconds: %d%n" , seqElapsedTime);
   }
}