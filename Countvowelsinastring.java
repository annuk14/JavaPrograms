package com.qa.javaprograms;

public class Countvowelsinastring {

	public static void main(String[] args) {

		String s="javajdks";
		//countVowel(s);
		countVowel(s);
	}

	//1st way:
//	public static void countVowel(String s){
//		char ch[]=s.toCharArray();
//		int count=0;
//		for(char c:ch){
//		switch(c){
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			count++;
//			break;
//		}
//	}
//		System.out.println("number of vowels in a string is:::::::"+count);
//}
	
	//2nd way:
	public static void countVowel(String s){
		char ch[]=s.toCharArray();
		int count=0;
		for(char c:ch){
			if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u'){
				count++;
			}
		}
		System.out.println("no.of vowels in a string is:::::"+count);
	}
	
}