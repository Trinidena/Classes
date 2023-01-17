public class JavaStudentStatic
{
   private String studentName;
   
   /* In this class, the variable className is a static  
      field.  There will only be one copy of this variable
      no matter how many objects are created.  They will all
      share this variable. */
   private static String className = "JVPR 3421 Java Programming";
   
   /* There is no need for the constructor to set the value of 
      className.  Static variables are initialized at the start of
      execution. */
   public JavaStudentStatic(String studentName)
   {
      this.studentName = studentName;
   }
   
   @Override
   public String toString()
   {
      return String.format("Student Name:  %10s  Class Name:  %s", studentName, className);
   }
}