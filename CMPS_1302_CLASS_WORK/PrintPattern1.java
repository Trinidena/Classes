public class PrintPattern1
{
   public static void main(String[] args)
   {
      printFigure(10);
   }
   
   public static void printFigure(int n)
   {
      if(n == 1)
      {
         System.out.println("#");
      }
      else
      {
         printFigure(n - 1);
         String s = "";
         for(int i = 0; i < n; i++)
         {
            s = s + "# ";
         }
         System.out.println(s);
      }   
   }
}