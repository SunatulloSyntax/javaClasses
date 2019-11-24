package review9;

public class JamesMember {
//     DO THE FAMILY INCOME AS SAME AS SMITH FAMILY MEMBERS
	String firstName;
	static String lastName;
	char gender;
	int salary;
	static int count;
	
	public void increment() {
		count++;
	}
	
	public void memberInfo() {
		System.out.println(firstName + " " + lastName + " makes " + " $" +salary);
	}	 

}
