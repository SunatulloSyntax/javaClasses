package com.class4;

public class Recap1 {

	public static void main(String[] args) {
		boolean isDisplayed = false;
		String buttonText = "Sign in";
		
		buttonText = "changed";

		if (isDisplayed) {
			System.out.println("Button is displayed");
			if (buttonText.equals("Sign in")) {
				System.out.println("Test case pass");
			} else {
				System.out.println("Wrong text is displayed");
			}
		} else {
			System.out.println("Button is not displayed");
		}
	}

}
