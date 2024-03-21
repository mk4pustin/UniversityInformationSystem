package src;

public class Institute {

	public String name;

	@Override
	public String toString() {
		return "src.Institute{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	public String address;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void expelStudent() {
		// TODO - implement src.Institute.expelStudent
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

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}