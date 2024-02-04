package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringLength {

	public static void main(String[] args) {

		stringLen1("Testing");
		stringLen2("Testing");
		stringLen3("Testing");
		stringLen4("Testing");
		stringLen5("Testing");
		stringLen6("Testing");

	}
	
	/**
	 * Program to print length of string without using length() method
	 */
	
	//using split()method of String class and length property(variable)
	public static void stringLen1(String s) {
		
		System.out.println(s.split("").length);	
		
	}
	
	//using toCharArray()method and length variable
	public static void stringLen2(String s) {

		System.out.println(s.toCharArray().length);
		
	}
	
	
	public static void stringLen3(String s) {
		
		int c=0;
		for(char ch:s.toCharArray()) {
			c++;
		}
		System.out.println(c);
	}

	public static void stringLen4(String s) {
		
		int c=0;
		for(String e:s.split("")) {
			c++;
		}
		System.out.println(c);
	}

	//using java 8 streams
	public static void stringLen5(String s) {
		
		long c=s.chars().count();
		System.out.println(c);
		
	}
	
	//using regular exp :Pattern class and Matcher class
	public static void stringLen6(String s) {
		
		Pattern p=Pattern.compile("$");
		Matcher m=p.matcher(s);
		while(m.find()) {
			int len=m.end();
		System.out.println(len);
		}
	}



}
