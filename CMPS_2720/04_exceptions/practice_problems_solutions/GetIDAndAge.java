import java.util.Scanner;

public class GetIDAndAge
{
   public static void main(String[] args)
   {
      int id = -1;
      int age = -1;
      Scanner in = new Scanner(System.in);
      
      while(id != 0 || age != 0)
      {
         System.out.print("\nEnter an ID number and an age:  ");
         String idAgeString = in.nextLine();
         String[] idAgeArray = idAgeString.split(" ");
         
         if(idAgeArray.length < 2)
         {
            System.out.printf("Invalid input:  %s%n", idAgeString);
            continue; 
         }
         
         String idString = idAgeArray[0].trim();
         String ageString = idAgeArray[1].trim();
         try
         {
            id = Integer.parseInt(idString);
            
            if(id < 0 || id > 999)
            {
               throw new DataEntryException(idString); 
            }
         }
         catch(NumberFormatException e)
         {
            System.out.printf("Invalid input:  %s", idString);
            continue;
         }
         catch(DataEntryException e)
         {
            System.out.printf("Invalid ID value:  %d%n", id);
            continue;
         }
         
         try
         {
            age = Integer.parseInt(ageString);
            
            if(age < 0 || age > 119)
            {
               throw new DataEntryException(ageString); 
            }
         }
         catch(NumberFormatException e)
         {
            System.out.printf("Invalid input:  %s", ageString);
            continue;
         }         
         catch(DataEntryException e)
         {
            System.out.printf("Invalid age value:  %d%n", id);
            continue;         
         }            
      }      
   }
}