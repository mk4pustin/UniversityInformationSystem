package src;

public class Participation {

	public Double hours;

	public Double getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(Double hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public Participation(Double hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "src.Participation{" +
				"hours=" + hours +
				'}';
	}
}