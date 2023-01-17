public class OnlineMagazineSubscription extends MagazineSubscription
{
   public void setAddress(String address)
   {      
      if(address.indexOf("@") > -1)
      {
         this.address = address;
         rate = 9.0;
      }
      else
      {
         System.out.println("ERROR: Invalid address");
         rate = 0.0;
      }
   }
}