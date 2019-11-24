package review9;

public class SmithMember {
	
	static String lastName;
	static int familyIncome;
	static int count;
	
	String firstName;
	char gender;
	int salary;
	
	
	
	public static void addIncome(int memberIncome) {
		familyIncome += memberIncome;
		
	}
	
	public void increment() {
		count++;
	}
	
	public void memberInfo() {
		System.out.println(firstName + " " + lastName + " makes " + " $" +salary);
	}

}
