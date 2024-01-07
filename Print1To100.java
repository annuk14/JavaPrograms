package JavaPrograms;

import java.util.stream.IntStream;

public class Print1To100 {

	public static void main(String[] args) {

//		printNum();
		printNums();
		printNumber();
	}
	
	//print 1 to 100 without using number

	public static void printNum() {
		
		int one='A'/'A';
		String s="..........";
		for(int i=one;i<=(s.length()*s.length());i++) {
			System.out.println(i);
		}
	}
	
	//print 0 to 100 without using number
	
	public static void printNums() {
		
		String s="programmin";
		int zero=s.length()-s.length();
		int hun=s.length()*s.length();
		for(int i=zero;i<=hun;i++) {
			System.out.println(i);
		}
		
	}
	public static void printNumber() {
		
		IntStream.range(1, 101).forEach(System.out::println);
	}



}
