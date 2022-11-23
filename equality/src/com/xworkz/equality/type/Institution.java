package com.xworkz.equality.type;

public class Institution {

	private String instituteName;
	private String trainingCourses;
	private String noOfTopics;
	private double fees;
	private boolean aboutInstitution;
	private String headOFInstitution;
	private String location;
	private boolean experiencedTrainers;
	private int noOfBatches;
	private String type;

	public Institution() {
		System.out.println("Default const of institute");
	}

	public Institution(String instituteName, String trainingCourses, String noOfTopics, double fees,
			boolean aboutInstitution, String headOFInstitution, String location, boolean experiencedTrainers,
			int noOfBatches, String type) {
		super();
		this.instituteName = instituteName;
		this.trainingCourses = trainingCourses;
		this.noOfTopics = noOfTopics;
		this.fees = fees;
		this.aboutInstitution = aboutInstitution;
		this.headOFInstitution = headOFInstitution;
		this.location = location;
		this.experiencedTrainers = experiencedTrainers;
		this.noOfBatches = noOfBatches;
		this.type = type;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in institute");

		if (other instanceof Institution) {
			System.out.println("other is institute,can check the properties");
			Institution ref = (Institution) other;

			if (this.type.equals(ref.type) && this.location.equals(ref.location)
					&& this.trainingCourses.equals(ref.trainingCourses)
					&& this.headOFInstitution.equals(ref.headOFInstitution)
					&& this.instituteName.equals(ref.instituteName)) {
				System.out.println("type is same");
				System.out.println("location is same");
				System.out.println("trainingCourses is same");
				System.out.println("headofinstitution is same");
				System.out.println("institute is same");

				return true;
			}
		} else {
			System.out.println("other is not institute,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Institution[instituteName=" + instituteName + ",headofinstution=" + headOFInstitution + ", location="
				+ location + ",price=" + ",trainingCourses=" + trainingCourses + ",type=" + type
				+ ",experiencedTrainers=" + experiencedTrainers + ",noOfTopics=" + noOfTopics + ",aboutInstitution="
				+ aboutInstitution + ",type=" + type + ",fees=" + fees + ",noOfBatches=" + noOfBatches + "]";
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getTrainingCourses() {
		return trainingCourses;
	}

	public void setTrainingCourses(String trainingCourses) {
		this.trainingCourses = trainingCourses;
	}

	public String getNoOfTopics() {
		return noOfTopics;
	}

	public void setNoOfTopics(String noOfTopics) {
		this.noOfTopics = noOfTopics;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public boolean isAboutInstitution() {
		return aboutInstitution;
	}

	public void setAboutInstitution(boolean aboutInstitution) {
		this.aboutInstitution = aboutInstitution;
	}

	public String getHeadOFInstitution() {
		return headOFInstitution;
	}

	public void setHeadOFInstitution(String headOFInstitution) {
		this.headOFInstitution = headOFInstitution;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isExperiencedTrainers() {
		return experiencedTrainers;
	}

	public void setExperiencedTrainers(boolean experiencedTrainers) {
		this.experiencedTrainers = experiencedTrainers;
	}

	public int getNoOfBatches() {
		return noOfBatches;
	}

	public void setNoOfBatches(int noOfBatches) {
		this.noOfBatches = noOfBatches;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
