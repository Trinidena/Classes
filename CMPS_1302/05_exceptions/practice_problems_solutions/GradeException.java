public class GradeException extends Exception
{
   public static final String[] letterGradeValues = {"A", "B", "C", "D", "F", "I"};
   
   public GradeException(String gradeInfo)
   {
      super(gradeInfo);
   }
}