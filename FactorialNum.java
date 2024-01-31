package JavaPrograms;

import java.math.BigInteger;


public class FactorialNum {

	public static void main(String[] args) {

//		fact(5);
//		System.out.println(factorial(5));
//		System.out.println(factorials(100));
	}
	
	/**
	 * Print factorial of a number using iterative method
	 * TimeComplexity (TC):O(n)
	 * @Auxillary space:   O(1) 
	 */
	
	public static void fact(int num) {
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of a number "+num+" is:"+fact);
	}
	
	
	/**
	 * Print factorial of a number using recursion
	 * @TimeComplexity (TC):O(n)
	 * @Auxillary space:    O(n) 
	 */
	
	public static int factorial(int num) {
		
		if(num==0 ||num==1) {
			return 1;
		}		
		return num * factorial(num-1);
		}
	
	
	
	/**
	 * Print factorial of a large number 
	 * @using BigInteger
	 * @TimeComplexity (TC):O(n)
	 * @Auxillary space:    O(1) 
	 */
	public static BigInteger factorials(int num) {

		BigInteger b=new BigInteger("1");
		for(int i=2;i<=num;i++) {
			b=b.multiply(BigInteger.valueOf(i));
		}
		return b;
		
	
	}
}



