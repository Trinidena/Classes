public class PrintTriangle
{
   public static void main(String[] args)
   {
      printTriangle(0);
      printTriangle(10);
      printTriangle(25);
      printTriangle(50);
      printTriangle(100);
   }
   
   public static void printTriangle(int n)
   {
      if(n == 0)
      {
         System.out.println("");
      }
      else
      {
         printTriangle(n - 1);
         System.out.println();
         for(int i = 0; i < n; i++)
         {
            System.out.print("#");
         }
      }
   }
}