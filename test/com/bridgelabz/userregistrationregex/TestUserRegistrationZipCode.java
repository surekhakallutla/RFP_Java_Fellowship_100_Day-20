package com.bridgelabz.userregistrationregex;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class TestUserRegistrationZipCode {

	private static UserRegistration user;
	
	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();

	}
	
	@AfterClass
	public static void nullObj() {
		user = null;
	}

	private String input;
	private Boolean expected;
	
	
	public TestUserRegistrationZipCode(String input, Boolean expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection zipCodeInputs() {
		return Arrays.asList(new Object[][] {{"516360", true},{"102360", true},{"012345", false},{"123", false},
			{"100000", true},{"92812", false},{"000001", false},{"0102348", false}});
	}
	
	@Test
	public void testUserZipCode() {
		System.out.println("Input = "+ input);
		assertEquals(expected, user.validZipCode(input));
	}

}





