package exercises;

import java.util.*;
import java.util.Map.Entry;

public class MapTask {
	/*
	 * Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList.
	 * Step 2: Create appleMap<String, Object> and add below pairs into it. "Items",
	 * "Apple" "Price", 20.00 "Quantity", 10 Step 3: Add appleMap to dataList. Step
	 * 4: Create orangeMap<String, Object> and add below pairs into it. "Items",
	 * "Orange" "Price", 21.99 "Quantity", 10 Step 5: Add orangeMap to dataList.
	 * Step 6: Create a loop from dataList. Step 7: Retrieve each Key and store is
	 * in a variable. Step 8: calculate the subtotal of each object. Step 9: Print
	 * the values of each Iteration same as shown below in Output example. Step 10:
	 * Calculate the Sum of subtotal. and store is in variable called totalPurchase.
	 * 
	 * Step 11: After Loop Print the value of Total Purchase. Output:
	 * 
	 * Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0 Items: Orange Price:
	 * 21.99 Quantity: 10.0 SubTotal: 219.89999999999998 Your Purchase total : 419.9
	 */

	public static void main(String[] args) {
		List<Map<String, Object>> dataList = new ArrayList<>();
		Map<String, Object> apple = new TreeMap<>();
		apple.put("Items", "Apple");
		apple.put("Price", 20.00);
		apple.put("Quantity", 10);

		dataList.add(apple);

		Map<String, Object> orange = new TreeMap<String, Object>();
		orange.put("Items", "Orange");
		orange.put("Price", 21.99);
		orange.put("Quantity", 10);

		dataList.add(orange);

		Set<String> appleEntry = apple.keySet();

		Iterator<String> appleIt = appleEntry.iterator();

		Object t = 0;
		while (appleIt.hasNext()) {
			String key = appleIt.next();
			Object value = apple.get(key);

			double p = (double) apple.get("Price");
			Integer q = (Integer) apple.get("Quantity");
			t = p * q;

			System.out.print(key + ": " + value + " ");
		}
		System.out.println("SubTotal: " + t);

		Set<String> orangeEntry = orange.keySet();

		Object t1 = 0;
		for (String forLoop : orangeEntry) {
			String key = forLoop;
			Object value = orange.get(forLoop);

			Double p = (Double) orange.get("Price");
			Integer q = (Integer) orange.get("Quantity");
			t1 = p * q;

			System.out.print(key + ": " + value + " ");
		}
		System.out.println("SubTotal: " + t1);

		double appleTotal = (double) t;
		double orangeTotal = (double) t1;
		double totalPurchase = appleTotal + orangeTotal;

		System.out.println("Your Purchase is:  " + totalPurchase);

		System.out.println("- - - A N O T H E R - W A Y - - -");

		List<Map<String, Object>> dataList1 = new ArrayList<Map<String, Object>>();

		Map<String, Object> appleMap = new HashMap<String, Object>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);
		dataList1.add(appleMap);

		Map<String, Object> orangeMap = new HashMap<String, Object>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);

		dataList1.add(orangeMap);

		// find purchase total Price.
		double purchaseTotalPrice = 0;

		for (Map<String, Object> map : dataList1) {
			String items = map.get("Items").toString();
			double price = Double.parseDouble(map.get("Price").toString());
			double quantity = Double.parseDouble(map.get("Quantity").toString());
			double lineTotal = price * quantity;

			System.out.println(
					"Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + lineTotal);
			purchaseTotalPrice += lineTotal;
		}
		System.out.println("Your Purchase total : " + purchaseTotalPrice);
	}

}
