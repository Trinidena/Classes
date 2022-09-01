public class DeviceDemo
{
   public static void main(String[] args)
   {
   
      Device[] devices = {new Desktop("Dell" , 1500.99 , "16 GB") , 
                          new Desktop("Lenovo" , 1699.99 , "32 GB") , 
                          new Tablet("Apple" , 999.00 , "12.9 IN") , 
                          new Tablet("Samsung" , 149.99 , "8.7 IN")};
                          
      for(Device device : devices)
         System.out.println(device);
   } 
}