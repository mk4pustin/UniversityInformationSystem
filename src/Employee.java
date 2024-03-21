package src;

public class Employee{

	public int counter;
	public String email;
	public String name;
	public int ssNo;

	public int getCounter() {
		return this.counter;
	}

	/**
	 * 
	 * @param counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getSsNo() {
		return this.ssNo;
	}

	/**
	 * 
	 * @param ssNo
	 */
	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

}