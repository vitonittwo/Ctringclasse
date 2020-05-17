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
	String str2 = str1;
	System.out.println(str2);

		// 3) Using new Keyword

	String str3 = new String("New keywords");
	System.out.println(str3);

		// String methods

		//  length(), method String class

	  int len = sclass.length();
	System.out.println("String length is " + len + " character");

	    // Concatenating Strings

	String stra = "The String class includes a method ";
	String strb = "for concatenating two strings";
	System.out.println("1 - " + stra.concat(strb));
	System.out.println("2 - " + stra + strb);
	String strq = "If you are using a multi-line line," +
				"you must use the '+' sign at the end of each line"; // line carryover does not occur!!!
	System.out.println(strq);

           // Strings format  creating

	System.out.printf("If you are using a multi-line line," +
				"you must use the '+' sign at the end of each line"); // line carryover does not occur!!!
	String ass;
		ass = String.format("If you are using a multi-line line," +
				"you must use the '+' sign at the end of each line"); // line carryover does not occur!!!
	System.out.println(ass);

		   // char charAt(int index) - Returns the character at the specified index
		char ind5 = stra.charAt(5);
	System.out.println("Fifth line character is " + ind5);
	// Example the charAt() method using
		palindrome();

		// int compareTo(String anotherString) - Compares this String to another Object.
	System.out.println("compareTo() Method:");

	System.out.println("Result of comparing stra and strb is " + (stra.compareTo(strb)));
		int lena = stra.length();
	System.out.println("String stra length is " + lena);
		int lenb = strb.length();
	System.out.println("String strb length is " + lenb);
	System.out.println("Arithmetic subtraction lenb with lena is: " + (lenb - lena));

	System.out.println("Result of comparing stra and strq is " + (stra.compareTo(strq)));
	System.out.println("String stra length is " + lena);
		int lenq = strq.length();
	System.out.println("String strq length is " + lenq);
	System.out.println("Arithmetic subtraction lenq with lena is: " + (lenq - lena));

	System.out.println("Result of comparing stra and stra is " + (stra.compareTo(stra)));

	System.out.println("Result of comparing strb and strq is " + (strb.compareTo(strq)));

	System.out.println("Result of comparing strq and strb is " + (strq.compareTo(strb)));



	 }
	// below are descriptions of the methods
	public static void palindrome() {
		String palindrome = "This String we can to read contrariwise";
		int lon = palindrome.length();
		char[] charArrayBefore = new char[lon];
		char[] charArrayAfter = new char[lon];
		for (int i = 0; i < lon; i++) {
			charArrayBefore[i] = palindrome.charAt(i);
		}
		for (int j = 0; j < lon; j++) {
			charArrayAfter[j] = charArrayBefore[lon - 1 - j];
		}
		String contrariwisePalindrome = new String(charArrayAfter);
		System.out.println("Palindrome result is: " + contrariwisePalindrome);
	}

}
