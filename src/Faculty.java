package src;

import java.util.Collection;

public class Faculty {

	Employee dean;
	public Institute institutes;
	public String name;

	@Override
	public String toString() {
		return "src.Faculty{" +
				"dean=" + dean +
				", institutes=" + institutes +
				", name='" + name + '\'' +
				'}';
	}

	public Institute getInstitutes() {
		return this.institutes;
	}

	/**
	 * 
	 * @param institutes
	 */
	public void setInstitutes(Institute institutes) {
		this.institutes = institutes;
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

	/**
	 * 
	 * @param dean
	 * @param institutes
	 * @param name
	 */
	public Faculty(Dean dean, Collection institutes, String name) {
		// TODO - implement src.Faculty.src.Faculty
	}

	public void setSessionDate() {
		// TODO - implement src.Faculty.setSessionDate
	}

}