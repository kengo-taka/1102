
public class SalesEmployee extends Employee {

	private int commisionLate;
	private int totalSales;

	public SalesEmployee(String firstName, String lastName, String email, String startDate, int phoneNumber,
			int commisionLate, int totalSales) {
		super(firstName, lastName, email, startDate, phoneNumber);
		this.commisionLate = commisionLate;
		this.totalSales = totalSales;
	}

	public int getCommisionLate() {
		return commisionLate;
	}

	public void setCommisionLate(int commisionLate) {
		if (commisionLate <= 0) {
			this.commisionLate = 1;
		} else {
			this.commisionLate = commisionLate;
		}
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		if (totalSales <= 0) {
			this.totalSales = 1;
		} else {
			this.totalSales = totalSales;
		}
	}

	@Override
	int calculateIncome() {
		int totalIncome = (int) (commisionLate * totalSales * 0.01);
		return totalIncome;
	}

	@Override
	public String toString() {
		return "SalesEmployee [firstName=" + super.getFirstName() + ", \nlastName=" + super.getLastName() + ", \nemail="
				+ super.getEmail() + ", \nstartDate=" + super.getStartDate() + ", \nphoneNumber="
				+ super.getPhoneNumber() + ", \ncommisionLate=" + commisionLate + ", \ntotalSales=" + totalSales
				+ ", \ntotalIncome=" + calculateIncome() + "]";
	}

}
