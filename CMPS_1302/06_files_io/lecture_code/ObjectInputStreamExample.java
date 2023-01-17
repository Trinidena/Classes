import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ObjectInputStreamExample
{
   public static void main(String[] args)
   {            
      try(FileInputStream fis = new FileInputStream("student_objects.bin");
          ObjectInputStream ois = new ObjectInputStream(fis);)
      {
         for(int i = 0; i < 3; i++)
         {
            Student aStudent = (Student)ois.readObject();
            System.out.println(aStudent);
         }               
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
      catch(ClassNotFoundException e)
      {
         e.printStackTrace();
      }           
   }
}