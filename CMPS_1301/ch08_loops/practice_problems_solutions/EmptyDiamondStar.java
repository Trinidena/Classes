import java.util.Scanner;

public class EmptyDiamondStar
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a positive odd integer.");
      int num = in.nextInt();
      
      for(int i = 0; i < num; i++)
      {
         for(int j = 0; j < num; j++)
         {
            if(j == Math.abs(i - num / 2) || j == num - 1 - Math.abs(i - num / 2))
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");  
            }   
         }
         System.out.println();
      }
   }
}