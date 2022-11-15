import java.util.*;
import java.io.*;
import java.net.*;

public class WordSearch
{
   public static void main(String[] args) throws MalformedURLException, IOException
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
      
      OrderedList<String> ordWords = new OrderedList<>();
      for(String word : words)
      {
         ordWords.insert(word);
      }
      
      //System.out.println(ordWords);
      long startTime = 0;
      long endTime = 0;
      startTime = System.nanoTime();
      for(String word : words)
      {
         ordWords.sequentialSearch(word);
      }
      endTime = System.nanoTime();
      long seqElapsedTime = (endTime - startTime) / 1000000;

      
      long startTime2 = System.nanoTime();
      for(String word : words)
      {   
         ordWords.binarySearch(word);
      }
      long endTime2 = System.nanoTime();
      long elapsedTime2 = (endTime2 - startTime2) / 1000000;
      System.out.printf("Time for sequential search in milliseconds:  %d%n", seqElapsedTime);      
      System.out.printf("Time for binary search in milliseconds:  %d%n", elapsedTime2);         
   }
}