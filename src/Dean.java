package src;

public class Dean extends Employee {

	/**
	 * 
	 * @param name
	 * @param salary
	 * @param email
	 * @param counter
	 * @param ssNo
	 */
	public Dean(String name, double salary, String email, int counter, int ssNo) {
		this.name = name;
		this.email = email;
		this.counter = counter;
		this.ssNo = ssNo;
	}

	public void processCertificationResults() {
		// TODO - implement src.Dean.processCertificationResults
	}

	@Override
	public String toString() {
		return "src.Dean{" +
				"counter=" + counter +
				", email='" + email + '\'' +
				", name='" + name + '\'' +
				", ssNo=" + ssNo +
				'}';
	}
}