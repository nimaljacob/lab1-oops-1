package com.greatlearning.javafsd.emailapp;

public class CredentialServiceImpl 
	
	implements ICredentialService{

	@Override
	public String generatePassword() {
		
		PasswordGenerator generator = new PasswordGenerator();
		
		String password = generator.generate();
		
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		String firstName = employee.getFirstName();
		
		String lastName  = employee.getLastName();
		
		String department = employee.getDepartment();
		
		StringBuilder emailBuilder = new StringBuilder();
		
		emailBuilder.append(firstName);
		emailBuilder.append(".");
		emailBuilder.append(lastName);
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".gl.com");
		
		String emailAddress = emailBuilder.toString();
		
		employee.setEmailAddress(emailAddress);
		// TODO Auto-generated method stub
		return emailAddress;
	}

	@Override
	public void displayCredentials(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
