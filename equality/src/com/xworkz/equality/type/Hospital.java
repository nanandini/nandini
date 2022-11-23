package com.xworkz.equality.type;

public class Hospital {

	private String HospitalName;
	private String docterName;
	private String operationame;
	private double billpay;
	private boolean aboutHospital;
	private String headOfHospital;
	private String location;
	private boolean experiencedTrainers;
	private int noOffacilities;
	private String typeofOperation;

	public Hospital() {
		System.out.println("Default const of hospital");
	}

	public Hospital(String hospitalName, String docterName, String operationame, double billpay, boolean aboutHospital,
			String headOfHospital, String location, boolean experiencedTrainers, int noOffacilities,
			String typeofOperation) {
		super();
		HospitalName = hospitalName;
		this.docterName = docterName;
		this.operationame = operationame;
		this.billpay = billpay;
		this.aboutHospital = aboutHospital;
		this.headOfHospital = headOfHospital;
		this.location = location;
		this.experiencedTrainers = experiencedTrainers;
		this.noOffacilities = noOffacilities;
		this.typeofOperation = typeofOperation;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in hospital");

		if (other instanceof Institution) {
			System.out.println("other is hospital,can check the properties");
			Hospital ref = (Hospital) other;

			if (this.docterName.equals(ref.docterName) && this.location.equals(ref.location)
					&& this.headOfHospital.equals(ref.headOfHospital) && this.HospitalName.equals(ref.HospitalName)
					&& this.operationame.equals(ref.operationame));
				
			{
				System.out.println("docterName is same");
				System.out.println("location is same");
				System.out.println("headOfHospital is same");
				System.out.println("HospitalName is same");
				System.out.println("operation is same");

				return true;
			}
		} 
		else {
			System.out.println("other is not hospital,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Institution[HospitalName=" + HospitalName + ",headOfHospital=" + headOfHospital + ", location="
				+ location + ",billPay=" + billpay + ",aboutHospital=" + aboutHospital + ",experiencedTrainers="
				+ experiencedTrainers + ",noOfFacilitiea=" + noOffacilities + ",typeOfOperation=" + typeofOperation
				+ "]";
	}

	public String getHospitalName() {
		return HospitalName;
	}

	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}

	public String getDocterName() {
		return docterName;
	}

	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}

	public String getOperationame() {
		return operationame;
	}

	public void setOperationame(String operationame) {
		this.operationame = operationame;
	}

	public double getBillpay() {
		return billpay;
	}

	public void setBillpay(double billpay) {
		this.billpay = billpay;
	}

	public boolean isAboutHospital() {
		return aboutHospital;
	}

	public void setAboutHospital(boolean aboutHospital) {
		this.aboutHospital = aboutHospital;
	}

	public String getHeadOfHospital() {
		return headOfHospital;
	}

	public void setHeadOfHospital(String headOfHospital) {
		this.headOfHospital = headOfHospital;
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

	public int getNoOffacilities() {
		return noOffacilities;
	}

	public void setNoOffacilities(int noOffacilities) {
		this.noOffacilities = noOffacilities;
	}

	public String getTypeofOperation() {
		return typeofOperation;
	}

	public void setTypeofOperation(String typeofOperation) {
		this.typeofOperation = typeofOperation;
	}

}
