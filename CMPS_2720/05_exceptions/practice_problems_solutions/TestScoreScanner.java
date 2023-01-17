import java.util.Scanner;
import java.util.InputMismatchException;

public class TestScoreScanner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      int[] idNumbers = {12345, 12312, 56321, 23422, 83423};
      int[] scores = {-1, -1, -1, -1, -1};
      
      for(int i = 0; i < idNumbers.length; i++)
      {
         System.out.printf("Enter a grade for Student #%d:  ", idNumbers[i]);
         int grade = 0;
         try
         {
            grade = in.nextInt();
            if(grade < 0 || grade > 100)
            {
               throw new ScoreException(String.format("Input is in an invalid range:  %d", grade));
            }
            scores[i] = grade;            
         }
         catch(ScoreException e)
         {
            //e.printStackTrace();
            System.out.printf("Invalid range: %d.  Setting the grade to 0.%n", grade);
            scores[i] = 0;         
         }
         catch(InputMismatchException e)
         {
            String badInput = in.nextLine();
            System.out.printf("Invalid input: %s.  Setting the grade to 0.%n", badInput);
            scores[i] = 0;

         }   
      }
      
      for(int i = 0; i < idNumbers.length; i++)
      {
         System.out.printf("Id:  %d  Grade:  %d%n", idNumbers[i], scores[i]);
      }
   }
}