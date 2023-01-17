public class ManualTypeConversion
{
   public static void main(String[] args)
   {
      // Primitive types.
      int num = 910;
      
      /* Uncomment the following statement to show that Java 
         won't automatically do the conversion! Must do this 
         manually. */      
      //byte aByte = num;
      byte aByte = (byte)num; // Fine. Doing the conversion manually.
      System.out.println(aByte); // What is printed?
      
      // Reference types.
      
      // Java automatically converts the Student object to a Person object.
      Person p1 = new Student("Alice", 19, 4.0);
      
      /* Uncomment the following statement to show that Java 
         won't automatically do the conversion! Must do this 
         manually. */ 
      //Student s1 = p1;
      
      Student s1 = (Student)p1; // Fine. Doing the conversion manually.
      System.out.println(s1); 
      
      // Not all manual casts are going to work
      //String number = (String)1;
   }
}