import java.util.Scanner;

class ElseIfExample
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter your score for 18 holes of golf:  ");
      int score = in.nextInt();
      
      if( score < 70 )
      {
         System.out.println("Skill Level:  Professional");
      }
      else if( score < 80 )
      {
         System.out.println("Skill Level: Amateur");
      }
      else if( score < 90 )
      {
         System.out.println("Skill Level: Duffer");
      }
      else if(score < 120 )
      {
         System.out.println("Skill Level: Scrub");
      }
      else
      {
         System.out.println("Skill Level: Beginner");
      }   
   }
}