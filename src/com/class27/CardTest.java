package com.class27;

public class CardTest {
	public static void main(String[] args) {
		String str = "Hello";
		//take an Object of the child class and give reference to the parent
//reference variable = object is created
		   Card card = new AX();
		   card.creditLimit();
		   
		   Card card1 = new MC();
		   card1.creditLimit();
		   
		   Card card2 = new Visa();
		   card2.creditLimit();
		   System.out.println("------------------------");
		   //type [] arrayName = {};
		   //type [] arrayName = new type[number of arrays
		   int[] numArray = {10,12,13};
		   String[] stringArray = {"aa", "bb"};
		   
//		   Card[] cardArray = {card, card1, card2};
		   Card[] cardArray1 = {new MC(), new AX(), new Visa(), new Discovery()};
		   
		   //cardArray[0] >>> MC
		   //cardArray[3] >>> Discovery
		   
		   for(Card myCard : cardArray1) {
			   myCard.creditLimit();
			   myCard.chargeInterest();
		   }
		   System.out.println("-----2nd way-----");
		   
		   for(int i = 0; i < cardArray1.length; i++) {
			   cardArray1[i].chargeInterest();
			   cardArray1[i].creditLimit();;
			   
		   }
		   System.out.println("----finish the second for loop -----");
		   
		   AX ax1 = new AX();
		   ax1.chargeInterest();
		   ax1.creditLimit();
		   
		   MC mc1 = new MC();
		   mc1.cashBack();
		   mc1.chargeInterest();
		   mc1.creditLimit();
		   
		   MC mc2 = new MC();
		   MC mc3 = new MC();
		   
		   Card cc = new MC();
		   cc.chargeInterest();
		   cc.creditLimit();
		   
		   System.out.println("-----creating an array that will hold only");
		   MC[] masterCard = {mc1, mc2, mc3};
		   for(MC mCard : masterCard) {
			   mCard.chargeInterest();
			   mCard.creditLimit();
		   }
	}

}
