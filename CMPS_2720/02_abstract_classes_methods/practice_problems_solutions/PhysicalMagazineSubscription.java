public class PhysicalMagazineSubscription extends MagazineSubscription
{
   public void setAddress(String address)
   {
      boolean hasDigit = false;
      
      for(char c : address.toCharArray())
      {
         if(Character.isDigit(c))
         {
            hasDigit = true;
            break;
         }   
      }
      
      if(hasDigit)
      {
         this.address = address;
         rate = 15.0;
      }
      else
      {
         System.out.println("ERROR: Invalid address");
         rate = 0.0;
      }
   }
}