class ValueMethodExample
{
   public static void main(String[] args)
   {
       double a1 = calcArea(7.2); // Return value stored in a1  
       System.out.printf("The area of a circle with radius %.2f " +
            "is %.2f.%n", 7.2, a1);
             
       System.out.printf("The area of a circle with radius %.2f " +
            "is %.2f.%n", 4.5, calcArea(4.5));

       double r1 = 8.7;              
       System.out.printf("The area of a circle with radius %.2f " +
            "is %.2f.%n", r1, calcArea(r1));                         
   }
   
   public static double calcArea(double radius)
   {
     double area = Math.PI * Math.pow(radius, 2.0);
     return area; 
   }        
}