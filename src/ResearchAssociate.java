package src;

public class ResearchAssociate extends Employee {

	public String fieldOfStudy;

	public ResearchAssociate() {

	}

	@Override
	public String toString() {
		return "src.ResearchAssociate{" +
				"fieldOfStudy='" + fieldOfStudy + '\'' +
				", name='" + name + '\'' +
				", counter=" + counter +
				", email='" + email + '\'' +
				", name='" + name + '\'' +
				", ssNo=" + ssNo +
				'}';
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String name;

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public ResearchAssociate(String fieldOfStudy, String name) {
		this.fieldOfStudy = fieldOfStudy;
		this.name = name;
	}

	/**
	 * 
	 * @param fieldOfStudy
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public void startProject() {
		// TODO - implement src.ResearchAssociate.startProject
	}

}