public class AnonymousClassExample
{
    public static void main(String[] args)
    {
        displayMessage();
    }
    
    private static void displayMessage()
    {
        String greeting = "Hello";
          
        // An anonymous class inside a method.
        System.out.println(new Object()
        {
            public String partOne;
            public String partTwo;
            
            @Override
            public String toString()
            {
               return greeting;
            }  
                       
        });
    }
}