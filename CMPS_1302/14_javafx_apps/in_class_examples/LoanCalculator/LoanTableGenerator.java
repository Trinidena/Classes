public class LoanTableGenerator {

	private double amount;
	private int years;
	private String loanTable = "";

	void generateLoanTable() {		
		StringBuilder text = new StringBuilder();
		text.append("\nInterest Rate\t\tMonthly Payment\t\t\tTotal Payment\n");
		for(int i = 0; i < 25; i++)
		{
			double yearlyRate = 0.05 + 0.00125 * i;
			double monthlyRate = yearlyRate / 12.0;
			double payment = this.amount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, this.years * 12.0));
			double totalPayment = payment * this.years * 12.0; 
			text.append(String.format("%.3f%%\t\t\t\t$%.2f\t\t\t\t$%,.2f%n", 100 * yearlyRate, 
					payment, totalPayment));
		}
		loanTable = text.toString();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getLoanTable() {
		return loanTable;
	}

	public void setLoanTable(String loanTable) {
		this.loanTable = loanTable;
	}

	@Override
	public String toString() {
		return loanTable;
	}
}