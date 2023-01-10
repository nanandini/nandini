package com.xworkz.streamTask.DTO;

public class CompanyCEODto {

	private String names;
	private String company;
	private int ages;
	private String country;
	private String qualification;
	private boolean married;
	private DaugtherDTO daugtherDTO;

	public CompanyCEODto() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public String toString() {
		return "CompanyCEODto [names=" + names + ", company=" + company + ", ages=" + ages + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", daugtherDTO=" + daugtherDTO
				+ ", toString()=" + super.toString() + "]";
	}

	public CompanyCEODto(String names, String company, int ages, String country, String qualification, boolean married,
			DaugtherDTO daugtherDTO) {
		super();
		this.names = names;
		this.company = company;
		this.ages = ages;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.daugtherDTO = daugtherDTO;
	}

	@Override
	public int hashCode() {
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyCEODto) {
				CompanyCEODto companyCEODTO = (CompanyCEODto) obj;
				if (companyCEODTO.getNames().equals(this.names)) {

					System.out.println("Cheacking Sucessfully ");
					return true;
				}

			}
		}
		return false;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAges() {
		return ages;
	}

	public void setAges(int ages) {
		this.ages = ages;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaugtherDTO getDaugtherDTO() {
		return daugtherDTO;
	}

	public void setDaugtherDTO(DaugtherDTO daugtherDTO) {
		this.daugtherDTO = daugtherDTO;
	}

}
