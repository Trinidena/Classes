public class Student extends Person
{
   private double gpa;
   
   public Student(String name, int age, double gpa)
   {
      super(name, age);
      this.gpa = gpa;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s GPA: %.2f", super.toString(), gpa);
   }
}