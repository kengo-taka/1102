
public class HourlyEmployee extends Employee{

	private int payLate;
	private int hoursWorking;
	public HourlyEmployee(String firstName, String lastName, String email, String startDate, int phoneNumber,
			int payLate, int hoursWorking) {
		super(firstName, lastName, email, startDate, phoneNumber);
		this.payLate = payLate;
		this.hoursWorking = hoursWorking;
	}
	public int getPayLate() {
		return payLate;
	}
	public void setPayLate(int payLate) {
		if (payLate <= 0) {
			this.payLate = 1;
		} else {
		this.payLate = payLate;
	}
	}
	public int getHoursWorking() {
		return hoursWorking;
	}
	public void setHoursWorking(int hoursWorking) {
		if (hoursWorking <= 0) {
			this.hoursWorking = 1;
		} else {
			this.hoursWorking = hoursWorking;
		}
	}
	
	
	@Override
	int calculateIncome() {
		int totalIncome = payLate * hoursWorking;
		return totalIncome;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [firstName=" + super.getFirstName() + ",\nlastName=" + super.getLastName() + ", \nemail=" + super.getEmail() + ", \nstartDate="
				+ super.getStartDate() + ", \nphoneNumber=" + super.getPhoneNumber() + ", \npayLate=" + payLate + ", \nhoursWorking=" + hoursWorking + ", \ntotalIncome=" + calculateIncome() + "]";
	}
	
	
	

}
