package src;

public class Course {

	public String name;
	public float hours;
	public int id;

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

	public float getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(float hours) {
		this.hours = hours;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @param name
	 * @param hours
	 * @param id
	 */
	public Course(String name, double hours, int id) {
		// TODO - implement src.Course.src.Course
	}

	public void cancelLesson() {
		// TODO - implement src.Course.cancelLesson
	}

	@Override
	public String toString() {
		return "src.Course{" +
				"name='" + name + '\'' +
				", hours=" + hours +
				", id=" + id +
				'}';
	}
}