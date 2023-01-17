public class BankAccount extends Asset implements Measurable
{
   private double balance;
   
   public BankAccount(String idNumber, double balance)
   {
      super(idNumber);
      this.balance = balance;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  Bal: %,.2f", super.toString(), balance);
   }
   
   public String description()
   {
      return "You can store money in it.";
   }
   
   public double getMeasure()
   {
      return balance;
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public void setBalance(double balance)
   {
      this.balance = balance;
   }
}