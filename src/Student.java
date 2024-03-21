package src;

public class Student {

	public String name;

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

	public void executeTask() {
		// TODO - implement src.Student.executeTask
	}

	@Override
	public String toString() {
		return "src.Student{" +
				"name='" + name + '\'' +
				'}';
	}

	public Student(String name) {
		this.name = name;
	}
}