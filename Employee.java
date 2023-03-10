import javax.swing.JDialog;

public class Employee extends JDialog {
	private String name;
	private int employeeID;
	private static int employeeIDF = 99;
	private double salary;

	private String gender;

	public Employee(String name, double salary, String gender) {
		this.name = name;
		this.salary = salary;
		if (!this.name.isEmpty() || this.salary != 0 || !this.gender.isEmpty()) {
			this.employeeID = employeeIDF += 1;
		} else {
			;
		}

		this.gender = gender;

	}

	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}

	public double getSalary() {
		return this.salary;
	}

	public int getEmployeeId() {
		return this.employeeID;
	}

	public void setEmployeeId(int newID) {
		this.employeeID = newID;
	}

	public void raiseSalary(double amount) {
		this.salary += amount;
	}

	public void decreaseSalary(double amount) {
		this.salary -= amount;
	}

	@Override
	public String toString() {
		return String.format("Employee: %s, Employee ID: %s, Gender: %s, Salary: $%.2f",
				this.getName(), this.getEmployeeId(), this.getGender(), this.getSalary());
	}

}
