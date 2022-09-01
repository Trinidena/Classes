public class CarSold extends ItemSold
{
   protected boolean licensed;
   protected boolean insured;
   protected boolean operable;
   
   public CarSold(int invoice , String description , double price , boolean licensed , boolean insured , boolean operable)
   {
      super(invoice , description , price);
      this.licensed = licensed;
      this.insured = insured;
      this.operable = operable;
   }
   
   public String toString()
   {
      return String.format("%s , Licensed: %b , Insured: %b , Operable: %b" , 
         super.toString() , licensed , insured , operable);
   }
}