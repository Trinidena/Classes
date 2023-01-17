public class Numbers extends Asset implements Measurable
{
   private int[] numbers;
   
   public Numbers(String idNumber, int[] numbers)
   {
      super(idNumber);
      this.numbers = numbers;
   }

   @Override
   public String toString()
   {
      return String.format("%s  Numbers: %s", super.toString(), arrayToString());
   }
   
   public String description()
   {
      return "It's a list of numbers.";
   }
   
   public double getMeasure()
   {
      if(numbers != null && numbers.length > 0)
      {
         int sum = 0;
         for(int number : numbers)
         {
            sum += number;
         }
      
         return sum / (double)numbers.length;
      }
      else
      {
         return 0.0;
      }   
   }
   
   /* Helper method for toString() method.
      Returns a String version of field numbers
      Can also import java.util.Arrays and just use 
      Arrays.toString(numbers) in the toString( ) method. */
   private String arrayToString()
   {
      if(numbers == null)
      {
         return "null";
      }
      else
      {
         String out = "[";
         for(int i = 0; i < numbers.length; i++)
         {
            out = out + numbers[i] + " ";
         }
         out = out.substring(0, out.length() - 1) + "]";
         return out;
      }      
   }
   
   public int[] getNumbers()
   {
      return numbers;
   }
   
   public void setNumbers(int[] numbers)
   {
      this.numbers = numbers;
   }
}