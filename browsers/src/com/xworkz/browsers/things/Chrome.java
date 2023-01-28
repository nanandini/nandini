package com.xworkz.browsers.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.browsers.ruleType.Browser;
import com.xworkz.browsers.ruleType.Provider;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	@Override
	public void browse() {
		System.out.println("calling browse method from Browser");
		provider.connect();
	}

}
