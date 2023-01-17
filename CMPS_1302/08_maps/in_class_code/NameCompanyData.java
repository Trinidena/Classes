import java.io.*;
import java.util.*;

public class NameCompanyData
{
   public static void main(String[] args)
   {
      Map<String, String> map = new HashMap<String, String>();
      
      try(FileReader fr = new FileReader("name_company_data.csv");
          BufferedReader br = new BufferedReader(fr))
      {
         String line = br.readLine();
         while(line != null)
         {
            String name = line.substring(0, line.indexOf(","));
            String company = line.substring(line.indexOf(",") + 1).replace("\"","");
            map.put(name, company);
            line = br.readLine();
         }
      }
      catch(FileNotFoundException e)
      {
         e.printStackTrace();
         System.exit(0);
      }
      catch(IOException e)
      {
         e.printStackTrace();
         System.exit(0);
      }
      
      System.out.printf("Sheena Gregorowicz works for %s.%n%n", map.get("Sheena Gregorowicz"));
      
      System.out.println("People whose names begins with Fred:  ");
      Set<String> names = map.keySet();
      for(String name : names)
      {
         if(name.startsWith("Fred"))
            System.out.println(name);
      }
      
      System.out.println("\nPeople who work for LLCs:");
      Set<Map.Entry<String, String>> entries = map.entrySet();
      for(Map.Entry<String, String> entry : entries)
      {
         if(entry.getValue().contains("LLC"))
         {
            System.out.printf("Name:  %-20s Company:  %s%n", entry.getKey(),
               entry.getValue());
         }
      }          
   }
}
