package com.xworkz.equality.boot;

import com.xworkz.equality.type.Currency;

public class CurrencyRunner {

	public static void main(String[] args) {

		Currency currency = new Currency();
		currency.setCoins(3);
		currency.setControlledBy("AXIS BANK OF INDIA");
		currency.setCountry("INDIA");
		currency.setIndianCurrency(true);
		currency.setOfficialUser("india");
		currency.setOtherName("DOLLER");
		currency.setRole("Reserve bank of india act");
		currency.setSource("RBI REPORT");
		currency.setUses(false);
		currency.setValuation(2020 - 21);
		System.out.println(currency);

		Currency currency2 = new Currency("doller", "axis bank", "rbi", 2020, false, "reserve", "india", false, 0,
				null);
		System.out.println(currency2);

		boolean same = currency.equals(currency2);
		System.out.println(same);
	}

}
