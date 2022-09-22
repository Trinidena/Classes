import java.util.*;

public class Course
{
   private int credits;
   private String department;
   private String number;
   
   public Course(String department, String number, int credits)
   {
      this.department = department;
      this.number = number;
      this.credits = credits;
   }
   
   public static class CreditComparator implements Comparator<Course>
   {
      public int compare(Course o1 , Course o2)
      {
         return o1.getCredits() - o2.getCredits();
      }
   }
   
   public static class IDComparator implements Comparator<Course>
   {
      public int compare(Course o1 , Course o2)
      {
         return o1.getID().compareTo(o2.getID());
      }
   }
   
   public int getCredits()
   {
      return credits;
   }
   
   public String getID()
   {
      return department + number;
   }
   
   public String toString()
   {
      return String.format("%s%s (%d)", department, number, credits);
   }
}