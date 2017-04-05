package in.vishwavijay.example.spring.boot.main;

public class Tax {
	private int tax;
	private int taxableIncome;
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTaxableIncome() {
		return taxableIncome;
	}
	public void setTaxableIncome(int taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	public Tax(int tax, int taxableIncome) {
		super();
		this.tax = tax;
		this.taxableIncome = taxableIncome;
	}
	
	
}
