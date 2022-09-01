public class WhileLoopProblem
{
   public static void main(String[] args)
   {
      int n = 1;
      while(n * n * n < 1024)
      {
         System.out.printf("%d cubed is %d.%n", n, n * n * n);
         n++;
      }
   }
}