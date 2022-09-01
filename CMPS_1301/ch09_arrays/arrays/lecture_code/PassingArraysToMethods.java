import java.util.Arrays;

public class PassingArraysToMethods
{
   public static void main(String[] args)
   {
      // Create a variable of primitive type.
      int a = 3;
    
      // Pass the variable a to methodA.
      methodA(a);
      
      // Verify no change to a.
      System.out.printf("a:  %d%n", a);
      
      System.out.println("Reason:  Primitive types are passed by value.\n\n");
      
      // Create an array.
      int[] b = {4, 7, 9};
      
      // Pass the array b to methodB.
      methodB(b);
      
      // Original has been changed!
      System.out.printf("b:  %s%n", Arrays.toString(b));
      
      System.out.println("Reason:  Arrays and objects are passed by reference.\n\n");          
   }
   
   public static void methodA(int val)
   {
      System.out.println("Inside methodA.");
      System.out.printf("The value of the variable val is currently %d.%n", val);
      System.out.println("Changing val to 7.");
      val = 7;
      System.out.printf("The value of the variable val is currently %d.%n", val); 
      System.out.println("methodA is over, so returning.");    
   }
   
   public static void methodB(int[] val)
   {
      System.out.println("Inside methodB.");
      System.out.printf("The array val is currently %s.%n", Arrays.toString(val));
      System.out.println("Changing first element of val to 7.");
      val[0] = 7;
      System.out.printf("The array val is currently %s.%n", Arrays.toString(val)); 
      System.out.println("methodB is over, so returning.");    
   }
   
}