public class JavaStudentInstance
{
   private String studentName;
   
   /* In this class, the variable className is an instance 
      (non-static) field.  Every object will get its own 
      copy of this variable. In this case, it is a waste
      of memory, because each student is in the same 
      programming class. */
   private String className;
   
   public JavaStudentInstance(String studentName, String className)
   {
      this.studentName = studentName;
      this.className = className;
   }
   
   @Override
   public String toString()
   {
      return String.format("Student Name:  %10s  Class Name:  %s", studentName, className);
   }
}