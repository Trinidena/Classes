public class Student
{
   private String lastName;
   private String firstName;
   private int studentId;
   private double gpa;
   
   public Student(String lastName, String firstName, int studentId, double gpa)
   {
      this.lastName = lastName;
      this.firstName = firstName;
      this.studentId = studentId;
      this.gpa = gpa;
   }
   
   public double getGpa()
   {
      return gpa;
   }
   
   public void setGpa(double gpa)
   {
      this.gpa = gpa;
   }
   
   @Override
   public String toString()
   {
         return String.format("%-15s  %5d  %.2f", lastName + ", " + firstName, studentId,
            gpa);
   }
}