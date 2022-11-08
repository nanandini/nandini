package com.xworkz.inheritance2.boot;

import com.xworkz.inheritance2.casting.Docter;
import com.xworkz.inheritance2.type.Cardiologist;
import com.xworkz.inheritance2.type.Dentist;
import com.xworkz.inheritance2.type.ENT;

public class DocterRunner {

	public static void main(String[] args) {
		Docter docter = new Docter();

		System.out.println(docter.DoctorName);
		System.out.println(docter.HospitalName);

		Docter docter1 = new ENT();

		ENT ent = (ENT) docter1;
		System.out.println(ent.patientName);
		System.out.println(ent.noOfPatients);

		Docter docter2 = new Dentist();

		Dentist dentist = (Dentist) docter2;
		System.out.println(dentist.OTname);
		System.out.println(dentist.specialist);

		Docter docter3 = new Cardiologist();

		Cardiologist cardio = (Cardiologist) docter3;
		System.out.println(cardio.operationIncharges);
		System.out.println(cardio.noOfPatientsInRoom);

	}

}
