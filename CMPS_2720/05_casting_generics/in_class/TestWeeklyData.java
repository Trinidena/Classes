import java.util.Calendar;

public class TestWeeklyData
{
   public static void main(String[] args)
   {
      WeeklyData<String> words = new WeeklyData<>();
      words.add("a");
      words.add("b");
      words.add("c");
      words.add("d");
      words.add("e");
      words.add("f");
      words.add("g");
      words.add("h");
      System.out.println(words);
      
      WeeklyData<Integer> numbers = new WeeklyData<>();
      for(int i = 0; i < 54; i++)
      {
         numbers.add(i);
      }
      System.out.println(numbers);                  
   }
}