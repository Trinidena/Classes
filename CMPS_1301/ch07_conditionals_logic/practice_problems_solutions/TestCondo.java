import java.util.Scanner;

public class TestCondo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter park, golf course, or lake.");
      String view = in.nextLine();
      System.out.println("Enter garage or parking space.");
      String parking = in.nextLine();
      
      Condo condo = new Condo(view, parking);
      
      System.out.println(condo);      
   }
}