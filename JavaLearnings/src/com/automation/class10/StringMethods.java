package com.automation.class10;

public class StringMethods {
	public static void main(String[] args) {
		String expectedTitle = "Good Morning";
		String actualTitle = "            good MORNING              ";
		String searchString = "tv";
		String productName = "Samsung 4k HD LED TV";

		System.out.println("=========Equals===========");
		System.out.println(expectedTitle.equals(actualTitle));

		System.out.println("=========Equal Ignore Case===========");
		System.out.println(expectedTitle.equalsIgnoreCase(actualTitle));

		System.out.println("=========Contains===========");
		System.out.println(productName.contains(searchString));

		System.out.println("=========ToUpperCase===========");
		System.out.println(actualTitle.toUpperCase());

		System.out.println("=========ToLowerCase===========");
		System.out.println(actualTitle.toLowerCase());

		System.out.println("=========Contains with ignoring case===========");
		System.out.println(productName.toLowerCase().contains(searchString.toLowerCase()));

		System.out.println("=========Trim===========");
		System.out.println(actualTitle.trim());
		System.out.println(expectedTitle.trim().equalsIgnoreCase(actualTitle.trim()));

		// =================String Operation====================

		String str1 = "This is my firts program";
		System.out.println("=========Empty===========");
		System.out.println(str1.isEmpty());

		String price = "INR 2,65,000";
		System.out.println("=========Replace===========");

		System.out.println(str1.replace("Morning", "Afternoon"));
		System.out.println(price.replace("INR", "").replace(",", "").trim());

		System.out.println("=========Replace ALL===========");
		System.out.println(price.replaceAll("[^0-9]", ""));

		System.out.println("=========Index Of===========");
		System.out.println(str1.lastIndexOf('o'));

		System.out.println("=========SubString===========");
		System.out.println(str1.substring(5, 7));

		System.out.println(str1.indexOf('i'));

		int indexOfFirst = str1.indexOf('i');

		int indexOfSecond = str1.substring(indexOfFirst + 1).indexOf('i') + 1;

		System.out.println(indexOfFirst + indexOfSecond);

		System.out.println("=========Format===========");
		String str = "Welcome %s!  %s";
		String username = "Urvi";
		String greetingMsg = "Good Afternoon";

		System.out.println(String.format(str, username, greetingMsg));

		String str11 = "Aood";
		String str22 = "aood";
		

		System.out.println(str11.compareTo(str22));
		
		
		String str33 = "This is my first java program";
		
		String words[] = str33.split(" ");
		
		System.out.println(price.split(" ")[1].replace(",", ""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
