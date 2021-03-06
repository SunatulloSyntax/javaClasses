package com.review13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TableDemo {

	public static void main(String[] args) {
		Map<String, String> map1 = createMap1();
		System.out.println(map1);

		Map<String, String> map2 = createMap2();
		System.out.println(map2);

		System.out.println("---List of Maps---");
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(createMap3());
		System.out.println(mapList);

		System.out.println("---Map Iterator---");
		Iterator<Map<String, String>> mapIterator = mapList.iterator();
		while (mapIterator.hasNext()) {
			Map<String, String> map = mapIterator.next();
//			System.out.println(map);
			System.out.println();
			Set<Entry<String, String>> mapEntries = map.entrySet();
			Iterator<Entry<String, String>> entryIterator = mapEntries.iterator();
			while (entryIterator.hasNext()) {
				Entry<String, String> entry = entryIterator.next();
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key + " -> " + value);
			}
		}

		// Homework Addition
		System.out.println("\n---createListOfMaps---");
		List<Map<String, String>> listOfMaps = createListOfMaps();

		Iterator<Map<String, String>> iterator = listOfMaps.iterator();
		while (iterator.hasNext()) {
			Map<String, String> map = iterator.next();
			String country = map.get("Country");
			if (country.equals("Germany")) {
				System.out.println(map);
			}
		}

		System.out.println();
		System.out.println("..............---- H O M E W O R K ----");
		
		List<Map<String, String>> HwMapList = createMapList();
		
		Iterator<Map<String, String>> mapListIterator = HwMapList.iterator();
		while(mapListIterator.hasNext()) {
			Map<String, String> HwMap = mapListIterator.next();
			String country1 = HwMap.get("Country");
			if(country1.equals("Mexico")) {
				System.out.println(HwMap);
			}
		}
	}

	
	
	
	// Homework Addition
	public static List<Map<String, String>> createListOfMaps() {
		List<Map<String, String>> listOfMaps = new ArrayList<Map<String, String>>();

		listOfMaps.add(createMap1());
		listOfMaps.add(createMap2());
		listOfMaps.add(createMap3());

		return listOfMaps;
	}

	public static Map<String, String> createMap1() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Alfreds Futterkiste");
		map1.put("Contact", "Maria Anders");
		map1.put("Country", "Germany");
		return map1;
	}

	public static Map<String, String> createMap2() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Centro comercial Moctezuma");
		map1.put("Contact", "Francisco Chang");
		map1.put("Country", "Mexico");
		return map1;
	}

	public static Map<String, String> createMap3() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Ernst Handel");
		map1.put("Contact", "Roland Mendel");
		map1.put("Country", "Austria");
		return map1;
	}

	public static List<Map<String, String>> createMapList() {
		List<Map<String, String>> mapList = new ArrayList<Map<String,String>>();
		mapList.add(createMap1());
		mapList.add(createMap2());
		mapList.add(createMap3());
		
		return mapList;
	}
}
