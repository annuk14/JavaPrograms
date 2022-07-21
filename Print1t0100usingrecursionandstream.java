package org.pc.com;

import java.util.stream.IntStream;

public class Print1t0100usingrecursionandstream {
	
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNumUsingStreams(int num) {
		
		IntStream.range(1, 101).forEach(e->
		System.out.println(e));
		
		
	}
	public static void main(String[] args) {

//		printNum(1);
		printNumUsingStreams(1);
	}

}
