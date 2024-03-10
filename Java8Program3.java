package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class Java8Program3 {

	public static void main(String[] args) {

		avg();
		
	}
	
	/**
	 * Program to print average of all numbers using java 8
	 */


	public static void avg() {
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,9,8);
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
	}
}
