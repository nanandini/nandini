package com.xworkz.equality.type;

public class Currency {
	private String otherName;
	private String controlledBy;
	private String source;
	private double valuation;
	private boolean indianCurrency;
	private String country;
	private String role;
	private boolean uses;
	private int coins;
	private String officialUser;

	public Currency() {
		System.out.println("Default const of india");
	}

	public Currency(String otherName, String controlledBy, String source, double valuation, boolean indianCurrency,
			String country, String role, boolean uses, int coins, String officialUser) {
		super();
		this.otherName = otherName;
		this.controlledBy = controlledBy;
		this.source = source;
		this.valuation = valuation;
		this.indianCurrency = indianCurrency;
		this.country = country;
		this.role = role;
		this.uses = uses;
		this.coins = coins;
		this.officialUser = officialUser;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in currency");

		if (other instanceof Currency) {
			System.out.println("other is paint,can check the properties");
			Currency ref = (Currency) other;

			if (this.country.equals(ref.country) && this.controlledBy.equals(ref.controlledBy)
					&& this.officialUser.equals(ref.officialUser) && this.otherName.equals(ref.otherName)
					&& this.role.equals(ref.role) && this.source.equals(ref.source)) {
				System.out.println("country is same");
				System.out.println("controlledby is same");
				System.out.println("officialuser is same");
				System.out.println("othername is same");
				System.out.println("role is same");
				System.out.println("source is same");
				return true;
			}
		} else {
			System.out.println("other is not currency,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint[companyName=" + controlledBy + ",brand=" + country + ", noOfShops=" + officialUser + ",price="
				+ otherName + ",goodMaterial=" + role + ",ownerName=" + source + ",locationOfShop=" + valuation
				+ ",quality=" + uses + ",signOfShop=" + indianCurrency + "" + ",type=" + coins + "]";
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getControlledBy() {
		return controlledBy;
	}

	public void setControlledBy(String controlledBy) {
		this.controlledBy = controlledBy;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public double getValuation() {
		return valuation;
	}

	public void setValuation(double valuation) {
		this.valuation = valuation;
	}

	public boolean isIndianCurrency() {
		return indianCurrency;
	}

	public void setIndianCurrency(boolean indianCurrency) {
		this.indianCurrency = indianCurrency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isUses() {
		return uses;
	}

	public void setUses(boolean uses) {
		this.uses = uses;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public String getOfficialUser() {
		return officialUser;
	}

	public void setOfficialUser(String officialUser) {
		this.officialUser = officialUser;
	}

}
