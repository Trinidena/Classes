import java.io.Serializable;

public class Student implements Serializable
{
   private String name;
   private int id;
   private double gpa;
   
   public Student(String name, int id, double gpa)
   {
      this.name = name;
      this.id = id;
      this.gpa = gpa;
   }
   
   @Override
   public String toString()
   {
      return String.format("Name:   %-10s  ID:  %d  GPA:  %.2f", name, id, gpa);
   }
}