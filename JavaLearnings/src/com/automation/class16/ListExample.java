package com.automation.class16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListExample {
	public static void main(String[] args) {

		List<Integer> listOfData = new LinkedList()<Integer>;
		
		Set<Integer> setOfData = new HashSet<Integer>();

		Map<String, Integer> phoneNumbers = new HashMap<String, Integer>();
		
		Map<Integer, String> days = new HashMap<Integer, String>();
		
		days.put(0, "Sunday");
		days.put(1, "Monday");
		days.put(2, "Tuesday");
		days.put(3, "Wed");
		days.put(3, "Thur");
		
		// Ankit - 9087987987
		// Chirag -9798585686

		setOfData.add(20); // 0
		setOfData.add(10); // 1
		setOfData.add(50); // 2
		setOfData.add(70); // 3
		setOfData.add(70);
		setOfData.add(50);
		
		phoneNumbers.put("Ankit", 908856759);
		phoneNumbers.put("Aziz", 789034567);
		phoneNumbers.put("Tom", 905678989);
		phoneNumbers.put("Urvi", 900000045);
		
		
		for (Integer integer : setOfData) {
			System.out.println(integer);
		}

	}
}
