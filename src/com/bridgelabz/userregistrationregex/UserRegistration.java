package com.bridgelabz.userregistrationregex;

import java.util.regex.Pattern;

import com.bridgelabz.userregistration.Constants;

public class UserRegistration {

	public boolean validFirstName(String fName) {
		if(Pattern.matches(Constants.FIRST_NAME_REGEX, fName))
				return true;
		else
			return false;
	}

	public boolean validLastName(String lName) {
		if(Pattern.matches(Constants.LAST_NAME_REGEX, lName))
			return true;
		else 
			return false;
	}

	public boolean validZipCode(String zipCode) {
		if (Pattern.matches(Constants.PINCODE_REGEX, zipCode))
			return true;
		else 
			return false;
	}

	public boolean validMobileNumber(String mobileNumber) {
		if (Pattern.matches(Constants.MOBILE_NUMBER_REGEX, mobileNumber))
			return true;
		else 
			return false;
	}

	public boolean validPassword(String password) {
		if (Pattern.matches(Constants.PASSWORD_REGEX, password))
			return true;
		else 
			return false;
	}

	public boolean isvalidEmail(String eMail) {
		if (Pattern.matches(Constants.USER_EMAIL_REGEX, eMail))
			return true;
		else 
			return false;
	}

}
