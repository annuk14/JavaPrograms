package org.pc.com;

public class Checkvowel {

	public static boolean isVowel(char ch) {
		
		
		return (ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u');			
		
	}

	
public static void checkVowel(String s) {

	int count=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(isVowel(ch)) {
			count++;
		}
	}
	System.out.println("vowels in a string :"+count);


}
	
	public static void main(String[] args) {

		String s="java testing";
		System.out.println(isVowel('a'));
		checkVowel(s);
	}

}
