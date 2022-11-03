public class BinaryCountdown
{
   public static void main(String[] args)
   {
      for(int i = 1; i < 16; i++)
      {
         
         System.out.println("n = " + i);
         binaryCountDown(i); 
         System.out.println("\n\n\n");
      }
   }
   
   public static void binaryCountDown(int n)
   {
      MyQueue<String> q = new MyQueue<>();
      q.add("1");
      for(int i = 0; i < n; i++)
      {
         String next = q.remove();
         System.out.println(next);
         q.add(next + "0");
         q.add(next + "1");
      }
   }
}