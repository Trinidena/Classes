class ArrayDeclarationInitializationExample
{
   public static void main(String[] args)
   {
      // Array Declarations
      
      /* Double is primitive type so each element of
         decimalNumbers is automatically initialized to 0.0; */
      double[] decimalNumbers = new double[10];
      
      /* boolean is a primitive type so each element of
         truthValues is automatically initialized to false. */
      boolean[] truthValues = new boolean[5];
      
      /* String is a reference type so the array words will be
         unitialized which could cause run-time errors later
         in your program */
      String[] words = new String[3];
      
      // Combined Declaration and Initialization for Short Arrays
      String[] names = { "Bob", "whatever", "blahblah" };      
      int[] wholeNumbers = { 11, 12 ,13 ,55, 78 };
      
      int[] numbers = new int[1000];
      
      /* Initializing the array numbers to all 1s
         instead of 0s */ 
      for( int i = 0; i < numbers.length; i++)
      {
         numbers[i] = 1;
      }
      
   }
}