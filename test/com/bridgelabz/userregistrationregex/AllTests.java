package com.bridgelabz.userregistrationregex;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestUserRegistrationEmail.class, TestUserRegistrationFirstName.class,
		TestUserRegistrationLastName.class, TestUserRegistrationMobileNumber.class, TestUserRegistrationPassword.class,
		TestUserRegistrationZipCode.class })
public class AllTests {

}
