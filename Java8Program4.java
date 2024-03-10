package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class Java8Program4 {

	public static void main(String[] args) {

		numbersSquareAverage();
	}
	
	/**
	 * Program to print square of a number first,then print those values which is greater than 100 and find average of these numbers using java 8
	 */

	public static void numbersSquareAverage() {
		
		List<Integer>list=Arrays.asList(1,10,20,30,15);
		double avg=list.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
	}

}
