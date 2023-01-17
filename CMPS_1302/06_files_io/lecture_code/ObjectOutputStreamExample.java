import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ObjectOutputStreamExample
{
   public static void main(String[] args)
   {        
      Student[] students = { new Student("Alice", 1, 3.87),
         new Student("Bob", 2, 3.54),
         new Student("Cal", 3, 2.78)};
         
      try(FileOutputStream fos = new FileOutputStream("student_objects.bin");
          ObjectOutputStream oos = new ObjectOutputStream(fos);)
      {
         oos.writeObject(students[0]);
         oos.writeObject(students[1]);
         oos.writeObject(students[2]);                  
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }          
   }
}