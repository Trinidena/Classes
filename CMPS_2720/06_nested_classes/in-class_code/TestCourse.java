import java.util.Arrays;

public class TestCourse
{
   public static void main(String[] args)
   {
      Course[] courses = {new Course("CMPS", "2720", 3), new Course("FYES","1000", 2), 
         new Course("MATH", "2253", 4), new Course("PHED", "1030", 1)};
      print(courses);
      
      Arrays.sort(courses, new Course.CreditComparator());
      print(courses); 
      
      Arrays.sort(courses, new Course.IDComparator());
      print(courses);              
   }
   
   public static <T> void print(T[] ts)
   {
      for(T t : ts)
      {
         System.out.println(t);
      }
      System.out.println();
   }
}