package com.bridgelabz.userregistrationregex;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestUserRegistrationFirstName {
	private static UserRegistration user;
	
	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
	}
	
	@AfterClass
	public static void nullObj() {
		user = null;
	}

	@Test
	public void testUserFirstNameWhenFirstCapAndMinTwoSmallNext_ThenPass() {
		boolean result = user.validFirstName("Rekha");	
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testUserFirstNameWhenAllCharactersSmall_ThenFail() {
		boolean result = user.validFirstName("rekha");	
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testUserFirstNameWhenFirstSmallAndMinTwoCapNext_ThenFail() {
		boolean result = user.validFirstName("rEKHA");	
		Assert.assertEquals(false, result);
	}

}
