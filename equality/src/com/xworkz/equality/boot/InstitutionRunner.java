package com.xworkz.equality.boot;

import com.xworkz.equality.type.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution institute = new Institution();
		institute.setAboutInstitution(true);
		institute.setExperiencedTrainers(true);
		institute.setFees(22000);
		institute.setHeadOFInstitution("OMKAR SIR");
		institute.setInstituteName("X-WORKZ");
		institute.setLocation("RAJAJINAGAR");
		institute.setNoOfBatches(3);
		institute.setNoOfTopics("JAVA,HTML,CSS");
		institute.setTrainingCourses("Core java");
		institute.setType("Application Development course");

		System.out.println(institute);

		Institution institute2 = new Institution("X-WORKZ", "Core java", "JAVA,HTML,CSS", 22000, true, "OMKAR SIR",
				"RAJAJINAGAR", true, 3, "Application Development course");
		System.out.println(institute2);
		boolean same = institute.equals(institute2);
		System.out.println(same);
	}
}
