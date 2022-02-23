package com.bridgelabz.userregistrationregex;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestUserRegistrationLastName {
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
	public void testUserLastNameWhenFirstCapAndMinTwoSmallNext_ThenPass() {
		boolean result = user.validLastName("Rekha");	
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testUserLastNameWhenAllCharactersSmall_ThenFail() {
		boolean result = user.validLastName("rekha");	
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testUserFirstNameWhenLastSmallAndMinTwoCapNext_ThenFail() {
		boolean result = user.validLastName("rEKHA");	
		Assert.assertEquals(false, result);
	}

}
