
public abstract class Employee {

	private String firstName;
	private String lastName;
	private String email;
	private String startDate;
	private int phoneNumber;

	public Employee(String firstName, String lastName, String email, String startDate, int phoneNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.startDate = startDate;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "unknown";
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "unknown";
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "unknown";
		}
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		if (!startDate.isEmpty() && !startDate.equalsIgnoreCase(null)) {
			this.startDate = startDate;
		} else {
			this.startDate = "unknown";
		}

	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		if (phoneNumber <= 0) {
			this.phoneNumber = 1;
		} else {
			this.phoneNumber = phoneNumber;
		}
	}

	abstract int calculateIncome();

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", startDate="
				+ startDate + ", phoneNumber=" + phoneNumber + "]";
	}

}
