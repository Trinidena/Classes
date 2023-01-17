public class CarSold extends ItemSold
{
   private boolean isLicensed;
   private boolean isInsured;
   private boolean isOperable;
   
   public CarSold(int invoiceNumber, String description, double price, 
                  boolean isLicensed, boolean isInsured, boolean isOperable)
   {
      super(invoiceNumber, description, price);
      this.isLicensed = isLicensed;
      this.isInsured = isInsured;
      this.isOperable = isOperable;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  Licensed: %b  Insured: %b  Operable: %b",
         super.toString(), isLicensed, isInsured, isOperable);
   }
   
   public boolean getIsLicensed()
   {
      return isLicensed;
   }
   
   public void setIsLicensed(boolean isLicensed)
   {
      this.isLicensed = isLicensed;
   }

   public boolean getIsInsured()
   {
      return isInsured;
   }
   
   public void setIsInsured(boolean isInsured)
   {
      this.isInsured = isInsured;
   }

   public boolean getIsOperable()
   {
      return isOperable;
   }
   
   public void setIsOperable(boolean isOperable)
   {
      this.isOperable = isOperable;
   }
   
}