public class Poem
{
   protected String title;
   protected int numberLines;
   
   public Poem(String title, int numberLines)
   {
      this.title = title;
      this.numberLines = numberLines;
   }
   
   @Override
   public String toString()
   {
      return String.format("Title: %s  Lines: %d", title, numberLines);
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public int getNumberLines()
   {
      return numberLines;
   }
}