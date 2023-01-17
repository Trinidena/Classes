import java.io.FileReader;
import java.io.BufferedReader;

public class CheckedExceptionExample
{
   public static void main(String[] args)
   {
      FileReader fr = new FileReader("words.txt");
      BufferedReader br = new BufferedReader(fr);
      String word = br.readLine();
      System.out.println(word);
   }
}