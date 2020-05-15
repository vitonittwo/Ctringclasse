package com.company;

public class Main {

    public static void main(String[] args) {

		// String class

    	// Strings creation

		// 1) String Literal

    	char[] scArray = {'S', 't', 'r', 'i', 'n', 'g', ' ', 'C', 'l', 'a', 's', 's'};
	String sclass = new String(scArray);
	System.out.println(sclass);
	sclass = sclass + " new"; // !!!
	System.out.println(sclass);
	String sLit = "String literal";
	System.out.println(sLit);

	// 2) Using another String object

		String str1 = "Using another String object";
		String str2 = new String(str1);
		System.out.println(str2);

		// 3) Using new Keyword

		String str3 = new String("New keywords");
		System.out.println(str3);

		//  length(), method String class

	int len = sclass.length();
	System.out.println("String length is " + len + " character");

    }
}
