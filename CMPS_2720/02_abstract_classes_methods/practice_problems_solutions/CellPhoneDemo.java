public class CellPhoneDemo
{
   public static void main(String[] args)
   {
      CellPhone[] phones = new CellPhone[6];
      
      phones[0] = new AndroidPhone("Nokia", "6.1");
      phones[0].setPrice();
      phones[0].setScreenSize(5.5);

      phones[1] = new AndroidPhone("Google", "Pixel");
      phones[1].setPrice();
      phones[1].setScreenSize(5.5);
            
      phones[2] = new IPhone("X");
      phones[2].setPrice();
      phones[2].setScreenSize(6.0);
      
      phones[3] = new IPhone("8");
      phones[3].setPrice();
      phones[3].setScreenSize(5.5);
      
      phones[4] = new WindowsPhone("Microsoft", "Lumia 950");
      phones[4].setPrice();
      phones[4].setScreenSize(4.5);
            
      phones[5] = new WindowsPhone("Microsoft", "Lumia 650");
      phones[5].setPrice();
      phones[5].setScreenSize(4.0);
            
      for(CellPhone phone : phones)
      {
         System.out.printf("Manufacturer:  %s  Model:  %s  Screen Size:  %.1f  Price:  $%.2f%n",
            phone.getManufacturer(), phone.getModel(), phone.getScreenSize(), phone.getPrice());
      }
   }
}