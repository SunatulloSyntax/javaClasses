package review3;

import java.util.Scanner;

public class Main41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rollNo;
		System.out.println("enter the roll number of the Child");
		rollNo = in.nextInt();
		switch (rollNo) {
		case 101:
			System.out.println("Student name: Ramesh");
			break;
		case 102:
			System.out.println("Student name: Mahesh");
			break;
		case 103:
			System.out.println("Student name: Mukesh");
			break;
		default:
			System.out.println("Not found Student name: in Class");
		}
	}
}
