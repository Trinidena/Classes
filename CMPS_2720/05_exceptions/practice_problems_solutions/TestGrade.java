import java.util.Arrays;
import javax.swing.JOptionPane;

public class TestGrade
{
   public static void main(String[] args)
   {
      int[] ids = {023366, 1232, 24563, 35673, 47232, 500192, 63434, 73482, 84324, 92323};
      String[] letterGrades = new String[ids.length];
      
      for(int i = 0; i < ids.length; i++)
      {
         try
         {   
            String letterGrade = JOptionPane.showInputDialog(String.format("Enter a letter grade for the student with ID number %d.", ids[i]));
            
            // In case the user clicks the Cancel button or tries to x out, check for null before converting to upper case.
            if(letterGrade != null)
            {
               letterGrade = letterGrade.toUpperCase();
            }
            
            if(!Arrays.asList(GradeException.letterGradeValues).contains(letterGrade))
            {
               throw new ScoreException("" + letterGrade);
            }
            
            letterGrades[i] = letterGrade;           
         }
         catch(ScoreException e)
         {
            JOptionPane.showMessageDialog(null, String.format("Invalid score:  %s.  Setting grade to I.", e.getMessage()));
            letterGrades[i] = "I";
         }    
      }
      
      StringBuilder s = new StringBuilder();
      
      for(int i = 0; i < ids.length; i++)
      {
         s.append(String.format("ID:  %010d  Score:  %s%n", ids[i], letterGrades[i]));
      }
      
      JOptionPane.showMessageDialog(null, s.toString());            
   }
}