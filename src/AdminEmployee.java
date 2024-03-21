package src;

public class AdminEmployee extends Employee {

	/**
	 * 
	 * @param name
	 * @param salary
	 * @param email
	 * @param counter
	 * @param ssNo
	 */
	public AdminEmployee(String name, double salary, String email, int counter, int ssNo) {
		this.name = name;
		this.email = email;
		this.counter = counter;
		this.ssNo = ssNo;
	}

	@Override
	public String toString() {
		return "src.AdminEmployee{" +
				"counter=" + counter +
				", email='" + email + '\'' +
				", name='" + name + '\'' +
				", ssNo=" + ssNo +
				'}';
	}

	public void hireNewEmployee() {
		// TODO - implement src.AdminEmployee.hireNewEmployee
	}

}