package src;

import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;

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

	public Date getStart() {
		return this.start;
	}

	/**
	 * 
	 * @param start
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public void publishResults() {
		// TODO - implement src.Project.publishResults
	}

	@Override
	public String toString() {
		return "src.Project{" +
				"name='" + name + '\'' +
				", start=" + start +
				", end=" + end +
				'}';
	}
}