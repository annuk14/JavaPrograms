package JavaPrograms;

import java.util.stream.IntStream;


public class PrintNumWOLoop {

	public static void main(String[] args) {

//		printNum(1,100);
		printNumber(1,101);
	}
	
	
	/**
	 * Print 1 to 100 without using for loop
	 */
	//using recursion:
	public static void printNum(int snum,int eNum) {
		
		if(snum<=eNum) {
			System.out.println(snum);
			snum++;
			printNum(snum,eNum);
				}
		
	}
	
	
	/**
	 *   Print 1 to 100 using java8 stream:IntStream
	 */
	
	
	public static void printNumber(int sIndex,int eIndex) {

      IntStream.range(sIndex, eIndex).forEach(System.out::println);
}
}
