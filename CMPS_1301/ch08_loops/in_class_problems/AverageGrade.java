/* Write a program that calculates the user’s average grade for the
semester. The user enters their final grades for each of their
courses, and the program adds them to a total. After the loop
terminates, the average grade is calculated and displayed. Students
can take any number of courses. */

import java.util.Scanner;

public class AverageGrade
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter your grades separated by spaces followed by a -1 to quit.");
      
      int grade = 0;
      int total = 0;
      int count = 0;
      
      while(grade != -1)
      {
         grade = in.nextInt();
         if( grade != -1)
         {
            total = total + grade;
            count++;
         }   
      }
      
      double average = (double)total / count;
      System.out.printf("Your average is %.2f.%n", average);
   }
}