import javax.swing.JOptionPane;

public class TestScore
{
   public static void main(String[] args)
   {
      int[] ids = {1232, 24563, 35673, 47232, 500192};
      int[] grades = new int[ids.length];
      
      for(int i = 0; i < ids.length; i++)
      {
         String gradeString = JOptionPane.showInputDialog(String.format("Enter a score for the student with ID number %d.", ids[i]));
         try
         {
            int grade = Integer.parseInt(gradeString);
            if(grade < 0 || grade > 100)
            {
               throw new ScoreException("" + grade);
            }           
            grades[i] = grade;
         }
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null, String.format("Invalid input:  %s.  Setting grade to 0.", gradeString));
            grades[i] = 0;            
         }
         catch(ScoreException e)
         {
            JOptionPane.showMessageDialog(null, String.format("Invalid score:  %s.  Setting grade to 0.", e.getMessage()));
            grades[i] = 0;
         }    
      }
      
      StringBuilder s = new StringBuilder();
      
      for(int i = 0; i < ids.length; i++)
      {
         s.append(String.format("ID:  %010d  Score:  %3d%n", ids[i], grades[i]));
      }
      
      JOptionPane.showMessageDialog(null, s.toString());            
   }
}