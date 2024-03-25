package JavaPrograms;

import java.util.Arrays;


public class SegregateevenOdd {

	public static void main(String[] args) {

		int a[]= {7,2,4,1,9};
		segregateEvenOddNum(a);
		
	}
	/**
	 * Program to segregate even and odd number from array such that all even number comes first then odd number
	 */
	
	
	public static void segregateEvenOddNum(int a[]) {
		
		int j=-1;
		for(int i=0;i<a.length;i++) {
        if(a[i]%2==0) {
           j++;
           int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
		
	}

}
        System.out.println(Arrays.toString(a));

			
		}

	
	}

