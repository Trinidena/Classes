public class LocalClassExample
{
    private void displayMessage()
    {
        String greeting = "Hello";
          
        // A local class inside a method.
        class LocalClass
        {
            public String partOne;
            public String partTwo;
              
            public LocalClass(String partOne, String partTwo)
            {
                this.partOne = partOne;
                this.partTwo = partTwo;
            }
            private String getPartOne()
            {
                return partOne;
            }
            private String getParts()
            {
                return partOne + " " + partTwo;
            }
            private String getFullMessage()
            {
                System.out.println("Inside inner class");
                return greeting + " " + partOne + " " + partTwo;
            }
        }
          
        LocalClass lc = new LocalClass("Good", "Bye");
        System.out.println("PartOne = "+ lc.getPartOne());
        System.out.println("Parts = " + lc.getParts());
        System.out.println("Full Message = " + lc.getFullMessage());
    }
      
    public static void main(String[] args)
    {
        LocalClassExample obj = new LocalClassExample();
        obj.displayMessage();
    }
}