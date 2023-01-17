public class JavaStudentDemo
{
   public static void main(String[] args)
   {
      JavaStudentInstance stu1 = new JavaStudentInstance("Adnan", "JVPR 3421 Java Programming");
      JavaStudentInstance stu2 = new JavaStudentInstance("Baltazar", "JVPR 3421 Java Programming");
      JavaStudentInstance stu3 = new JavaStudentInstance("Corvalis", "JVPR 3421 Java Programming");
      
      System.out.println(stu1);
      System.out.println(stu2);
      System.out.println(stu3);
      
      JavaStudentStatic stu4 = new JavaStudentStatic("Drago");
      JavaStudentStatic stu5 = new JavaStudentStatic("Englebert");
      JavaStudentStatic stu6 = new JavaStudentStatic("Funchess"); 
      
      System.out.println(stu4);
      System.out.println(stu5);
      System.out.println(stu6);           
   }
}