package com.bridgelabz.userregistrationregex;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class TestUserRegistrationEmail {
	UserRegistration user = new UserRegistration();

	private String input;
	private boolean expected;
	
	
	public TestUserRegistrationEmail(String input, boolean result) {	
		this.input = input;
		this.expected = result;
	}
		
	@Parameterized.Parameters
	public static Collection testEmailInputs() {
		return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},{"abc-100@yahoo.com", true},
			{"abc", false},{"abc@.com.my", false},{"abc.100@yahoo.com", true},{"abc123@gmail.a", false},
			{"abc()*@gmail.com", false},{"abc..2001@gmail.com", false}});
	}
	
	@Test
	public void testUserRegistrationEmail() {
		assertEquals(expected, user.isvalidEmail(input));
	}
	

}
