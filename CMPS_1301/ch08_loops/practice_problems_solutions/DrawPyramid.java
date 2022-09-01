import java.util.Scanner;

public class DrawPyramid
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.printf("\n\nProblem , enter a number from 1 to 9:  ");     
      int number = in.nextInt();
      
      for(int i = 1; i < Math.min(number + 1, 10); i++)
      {
         for(int j = 9; j > 1; j--)
         {
            if(j <= i)
            {
               System.out.printf("%d ", j);
            }
            else
            {
               System.out.printf("  ");
            }   
         } 
              
         for(int j = 1; j < i + 1; j++)
         {
            System.out.printf("%d ", j);
         }
         System.out.println();
      }  
   }
}