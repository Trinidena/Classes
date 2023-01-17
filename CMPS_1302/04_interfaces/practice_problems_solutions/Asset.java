public abstract class Asset
{
   protected String idNumber;
   
   public Asset(String idNumber)
   {
      this.idNumber = idNumber;
   }
   
   public abstract String description();
   
   @Override
   public String toString()
   {
      return String.format("ID: %s", idNumber);
   }
   
   public String getIdNumber()
   {
      return idNumber;
   }
   
   public void setIdNumber(String idNumber)
   {
      this.idNumber = idNumber;
   }
}