package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8Program2 {

	public static void main(String[] args) {
		
		sum();	
	}
	
	/**
	 * Program to print sum of all numbers using java 8
	 */

	public static void sum() {
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);
		Optional<Integer>sum=list.stream().reduce((a,b)->a+b);
		System.out.println(sum.get());
	}
}
