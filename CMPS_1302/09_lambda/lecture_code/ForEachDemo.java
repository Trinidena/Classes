import java.util.*;

public class ForEachDemo
{
   public static void main(String[] args)
   {
      List<Student> students = new ArrayList<Student>();
      students.add(new Student("Atwell", "Alice", 12345, 3.45));
      students.add(new Student("Brown", "Bob", 12346, 1.18));      
      students.add(new Student("Clark", "Charlie", 12347, 2.57));  
      
      students.forEach(System.out::println);
      
      students.forEach(o -> o.setGpa(o.getGpa() + 1));
      
      System.out.println();
      
      students.forEach(System.out::println);
   
      Map<String, Integer> map = new HashMap<String, Integer>();
      map.put("alpha", 1);
      map.put("bravo", 2);
      map.put("charlie", 3);
      map.put("delta", 4);
      map.put("echo", 5);
      
      System.out.println();
            
      map.entrySet().forEach(System.out::println);     
   }
}