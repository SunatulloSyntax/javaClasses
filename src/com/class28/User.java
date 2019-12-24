package com.class28;

/*Write program: userClass  that has a constructor that 
 * initializes name and mobile number istance variables.
 *  Create a subclass  userInfo that will have user address
 *   variable and it also being initialized through 
 *   constructor call. Print users name, mobile number 
 *   and address in userDetails method. Test your code.*/

public class User {
	String name;
	String mNumber;
	
	User(String name, String mNumber){
		this.name = name;
		this.mNumber = mNumber;
	}
	
	public static void main(String[] args) {
		UserInfo a = new UserInfo("Ali", "201-123-43-12", "500 Essex st");
		a.userDetails();
		
	}
}
class UserInfo extends User{
	
	String address;
	UserInfo(String name, String mNumber, String address){
		super(name, mNumber);
		this.address = address;
	}
	
	public void userDetails(){
		System.out.println(name + " " + mNumber + " " + address);
	}
}
