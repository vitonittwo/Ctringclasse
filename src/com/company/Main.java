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

		   // char charAt(int index)
	System.out.println("Returns the character at the specified index");
	System.out.println("Method Syntax: public char charAt(int index)");
	System.out.println("index - the index of the character to get from the string array");
		char ind5 = stra.charAt(5);
		char ind11 = strb.charAt(11);
	System.out.println("Fifth line character is " + ind5);
	System.out.println("Eleventh line character is " + ind11);

		// int compareTo(String anotherString) - Compares this String to another Object.
	System.out.println("compareTo() Method:");

		int comp = stra.compareTo(strb);
	System.out.println("Result of comparing stra and strb is " + comp);
		int lena = stra.length();
	System.out.println("String stra length is " + lena);
		int lenb = strb.length();
	System.out.println("String strb length is " + lenb);
	System.out.println("Arithmetic subtraction lenb with lena is: " + (lenb - lena));

		comp = stra.compareTo(strq);
	System.out.println("Result of comparing stra and strq is " + comp);
	System.out.println("String stra length is " + lena);
		int lenq = strq.length();
	System.out.println("String strq length is " + lenq);
	System.out.println("Arithmetic subtraction lenq with lena is: " + (lenq - lena));

		comp = stra.compareTo(stra);
	System.out.println("Result of comparing stra and stra is " + comp);
		comp = strb.compareTo(strq);
	System.out.println("Result of comparing strb and strq is " + comp);
		comp = strq.compareTo(strb);
	System.out.println("Result of comparing strq and strb is " + comp);



    }
}
