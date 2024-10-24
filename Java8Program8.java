package JavaPrograms;

import java.util.Arrays;

public class Java8Program8 {

	public static void main(String[] args) {

		int a[]= {1,2,-3,4,-5,-7};
		printNegNum(a);
	}
	
	public static void printNegNum(int a[]) {
		
//		Arrays.stream(a).filter(e->e<0).forEach(e->System.out.println(e));
		
		int output[]=Arrays.stream(a).filter(e->e<0).toArray();
		System.out.println(Arrays.toString(output));
	
	}

}
