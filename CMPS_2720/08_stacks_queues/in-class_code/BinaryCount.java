import java.util.Scanner;

public class BinaryCount
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a positive integer:  ");
      int n = scan.nextInt();
      scan.close();
      binaryCount(n);
   }
   
   public static void binaryCount(int n)
   {
      MyQueue<String> q = new MyQueue<>();
      q.add("1");
      for(int i = 0; i < n; i++)
      {
         String newString = q.remove();
         System.out.println(newString);
         q.add(newString + "0");
         q.add(newString + "1");
      }
   }
}