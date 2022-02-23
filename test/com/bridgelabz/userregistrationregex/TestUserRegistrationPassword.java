package com.bridgelabz.userregistrationregex;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import javax.security.auth.login.Configuration.Parameters;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestUserRegistrationPassword {
	
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
	
	
	public TestUserRegistrationPassword(String input, Boolean expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection passwordInputs() {
		return Arrays.asList(new Object[][] {{"Surekha@7", true},{"surekha@Sai7", true},{"surekha@7", false},{"SUREKHA@7", true},
			{"SuRekha@7sai", true},{"Surekha7", false}});
	}
	
	@Test
	public void testPassword() {
		System.out.println("Input = "+ input);
		assertEquals(expected, user.validPassword(input));
	}
	

}
