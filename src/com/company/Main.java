package com.company;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

import static java.util.Calendar.DECEMBER;

public class Main {

    public static void main(String[] args) {

		// String class

		// Strings creation

		// 1) String Literal

		boolean retVal;

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
				"you must use the \"+\" sign at the end of each line"; // line carryover does not occur!!!
		System.out.println(strq);

		// Strings format  creating
		String ass;
		ass = new String("Var 1:\nIf you are using a multi-line line,\nyou must use the \"+\" sign at the end of each line");
		System.out.println(ass);
		System.out.println("Var 2:\rIf you are using a multi-line line,\ryou must use the \"+\" sign at the end of each line");

		// char charAt(int index) - Returns the character at the specified index
		char ind5 = stra.charAt(5);
		System.out.println("Fifth line character is " + ind5);

		// Example the charAt() method using
		palindrome();

		// int compareTo(String anotherString) - Compares this String to another Object.
		System.out.println("compareTo() Method:");
		System.out.println("1 Result of comparing stra and strb is " + (stra.compareTo(strb)));
		System.out.println("2 Result of comparing stra and strb is " + (stra.compareToIgnoreCase(strb)));
		System.out.println("1 Result of comparing stra and strq is " + (stra.compareTo(strq)));
		System.out.println("2 Result of comparing stra and strq is " + (stra.compareToIgnoreCase(strq)));
		System.out.println("1 Result of comparing stra and stra is " + (stra.compareTo(stra)));
		System.out.println("2 Result of comparing stra and stra is " + (stra.compareToIgnoreCase(stra)));
		System.out.println("1 Result of comparing strb and strq is " + (strb.compareTo(strq)));
		System.out.println("2 Result of comparing strb and strq is " + (strb.compareToIgnoreCase(strq)));
		System.out.println("1 Result of comparing strq and strb is " + (strq.compareTo(strb)));
		;
		System.out.println("2 Result of comparing strq and strb is " + (strq.compareToIgnoreCase(strb)));

		// Method boolean contentEquals(StringBuffer sb
		// Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer.
		StringBuffer str5 = new StringBuffer("The String class includes a method ");
		StringBuffer str4 = new StringBuffer("for concatenating");
		boolean result1 = stra.contentEquals(str5);
		System.out.println("String \"The String class includes a method \" " +
				"is equals buffer line \"The String class includes a method \"? \n" + "\t" + result1);
		boolean result2 = strb.contentEquals(str4);
		System.out.println("String \"for concatenating two strings\"" +
				"is equals buffer line \"for concatenating\"? \n" + "\t" + result2);

		// Method static String copyValueOf(char[] data) and
		// static String copyValueOf(char[] data, int offset, int count)
		char[] chars = {'"', 'S', 't', 'r', 'i', 'n', 'g', ' ', 'M', 'e', 't', 'o', 'd', '"'};
		String sorcha2;
		sorcha2 = String.copyValueOf(chars);
		System.out.println("Return String: " + sorcha2);
		String sorcha3 = ""; // not needed since String.copyValueOf (strchar1) works
		sorcha3 = sorcha3.copyValueOf(chars);
		System.out.println("Return String: " + sorcha3);
		String sorcha5;
		sorcha5 = String.copyValueOf(chars, 6, 8);
		System.out.println("Return String: " + sorcha5);

// Method boolean endsWith(String suffix)
		retVal = str1.endsWith("String object");
		System.out.println("Return Value is: " + retVal); // true
		retVal = str1.endsWith("String obect");
		System.out.println("Return Value is: " + retVal); // false
		retVal = str1.endsWith("");
		System.out.println("Return Value is: " + retVal); // true

// Method boolean equals(Object anObject)
		equals();

		// boolean equalsIgnoreCase(String anotherString)
		 String caseVe1 = "Power";
		 String caseVe2 = "power";
		 retVal = caseVe2.equalsIgnoreCase(caseVe1); // true
		 System.out.println("The String caseVe1 is equals the String caseVe2?" + "\n" + "\t" + retVal);

		 // Methods getBytes() and byte[] getBytes(String charsetName
		try {
			byte[] Str = strb.getBytes();
			System.out.println("The return byte sequence is: " + Str);
			Str = strb.getBytes("UTF-8");
			System.out.println("The return sequence of bytes encoded in UTF-8 is: " + Str);
			Str = strb.getBytes("ISO-8859-1");
			System.out.println("The return sequence of bytes encoded in ISO-8859-1 is: " + Str);
			// Str = strb.getBytes("for concatenating two strings");
			// System.out.println("The return sequence is: " + Str); // UnsupportedEncodingException e
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// Methods subSequence() and substring()

		System.out.print("Method subSequence() return value: ");
		System.out.println(stra.subSequence(4, 17));
		System.out.print("Method substring() return value 1: ");
		System.out.println(stra.substring(5, 17));
		System.out.print("Method substring() return value 2: ");
		System.out.println(stra.substring(5));

		// String Formatting
		System.out.printf("%s = %d ", "Vitalijs", 35);
		System.out.printf("\n" + "My name is: %s%n",  "Vitalijs");

		StringBuilder sbuf = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		fmt.format("PI = %f%n", Math.PI); // %f - floating point	decimal number
		System.out.print(sbuf.toString());

		Formatter fmy = new Formatter(sbuf);
		fmy.format("q = %g%n", Double.MAX_VALUE); // %g - floating point decimal number,
		System.out.print(sbuf.toString()); // possibly in scientific notation depending on the precision and value.

		String hel = String.format("|%2$s|", 150, "  Hello  ");
		System.out.println(hel);
		String hes = String.format("%d", 150);
		System.out.println(hes);
		String hed = String.format("|%50d|", 150);
		System.out.println(hed);
		String hef = String.format("|%-20d|", 150);
		System.out.println(hef);
		String heg = String.format("|%020d|", 150);
		System.out.println(heg);

		// String vit = new String();
		Calendar vit = new GregorianCalendar(1959, DECEMBER,9);
		String birth = String.format("Vitally birthday is: %1$tb %1$te %1$tY, vit");
		System.out.println(birth);

	}
	// below are descriptions of the methods

	private static void equals() {
		String qwer = "Compares this string to the specified object";
		String qwer0 = qwer;
		String qwer1 = new String("object with which this string is compared");
		boolean retVal;
		retVal = qwer.equals(qwer0);
    	System.out.println("The String qwer is equals the String qwer0?" + "\n" + "\t" + retVal);
		retVal = qwer.equals(qwer1);
		System.out.println("The String qwer is equals the String qwer1?" + "\n" + "\t" + retVal);
	}

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
