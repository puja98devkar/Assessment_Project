package com.mypackage.emailvalidate;

public class EmailSearcher {
	String[] emails =  { 
			"madhu.patil@yahoo.com", 
			"pujarane786@google.com",
			"rahulpatil9806@domain.com", 
			"komalpatil884@domain.co.in", 
			"rani.patil98@domain.com", 
			"aanand.puri@domain.com", 
			"puja.devkar@yahoo.corporate.in"
	};
	
	
	public boolean SearchEmail(String emailToSearch) {
		
		for (String email : emails) {
			if (email.contentEquals(emailToSearch)) {
				return true;
			}
		}
		return false;
	}
}
