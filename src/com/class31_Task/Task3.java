package com.class31_Task;

//Create Registration Class in which you would have variables as email, 
//userName and password that have an access scope only within its own class.
//After creating an object of the class user should be able to call methods
//and in each method separately pass values to set users email, username 
//and password. 
//Requirements: 
//Valid email consider to be only gmail
//Valid userName and password cannot be empty and should be of length 
//larger than 6 characters. Also valid password cannot contain userName.
public class Task3 {

	public static void main(String[] args) {
		Registration obj = new Registration();

//		r.setEmail("@gmail.com");
//		String e = r.getEmail();

		obj.setUserName("John123445");
		System.out.println(obj.getUserName());
//		r.setPassword("Samsaee");
//		String p = r.getPassword();

//		System.out.println("The email of the user is " + u + e + " and the password is " + p);

	}

}

class Registration {
	private String email;
	private String userName;
	private String password;

	// getters
	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	// setters
	public void setEmail(String email) {
		if (email.contains("@gmail.com")) {
			this.email = email;
		} else {
			System.out.println("Invalid email type. Email must be gmail");
		}
	}

	public void setUserName(String userName) {
		if (userName.length() > 6) {
			if (!userName.isEmpty()) {
				this.userName = userName;
			} else {
				System.out.println("User name should have more than 6 characters.");
			}
		} else {
			System.out.println("User name cannot be empty.");
		}
	}

	public void setPassword(String password) {

		if (!password.isEmpty()) {
			if (password.length() >= 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Password cannot have user name.");
				}
			} else {
				System.out.println("Password should have more than 6 characters.");
			}
		} else {
			System.out.println("Password cannot be empty.");
		}
	}

}
