import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NameCompanyData
{
   public static void main(String[] args)
   {
      HashMap<String, String> map = new HashMap<String, String>();
      
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
      
      map.entrySet().removeIf(e -> e.getKey().contains("a") || e.getKey().contains("e"));
      map.entrySet().forEach(System.out::println);
      
      map.replaceAll((k,v) -> v.replace("i", "I").replace("o", "O").replace("u", "U").replace("y", "Y"));
      map.entrySet().forEach(System.out::println);   
   }
}