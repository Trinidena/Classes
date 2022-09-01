public class Chapter2PracticeProblem4
{
   public static void main(String[] args)
   {
      int points = 22;
      
      int touchdowns = 22 / 8;
      int remainingPoints = points % 8;
      
      int fieldGoals = remainingPoints / 5;
      
      int safetys = remainingPoints % 5;
      
      System.out.println("Given total points:  " + points);
      System.out.println("Touchdowns:  " + touchdowns);
      System.out.println("Field Goals:  " + fieldGoals);
      System.out.println("Safetys:  " + safetys);
   }
}