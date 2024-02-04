package JavaPrograms;

import java.util.Arrays;


public class LeetCodeArrQ1 {

	public static void main(String[] args) {

		//@output:1,3,12,0,0
//		int a[]= {0,1,0,3,12};
		int a[]= {0};
		moveAllZeroes(a);
		
	}
	
	/**
	 * Program to move all zeroes to the end maintaining relative order of elements of an array
	 */
	
	public static void moveAllZeroes(int a[]) {
		
		int c=0;
		for(int i:a ) {
			if(i!=0) {
				a[c]=i;
				c++;
			}
		}
		while(c<a.length) {
			a[c]=0;
			c++;
		}
		System.out.println(Arrays.toString(a));
	}

}
