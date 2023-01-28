package com.xworkz.browsers.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.browsers.ruleType.Browser;
import com.xworkz.browsers.ruleType.Provider;

@Component
public class FireBox implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;
        
	@Override
	public void browse() {
		System.out.println("Calling browse method from Browser");
		provider.connect();
	}

}
