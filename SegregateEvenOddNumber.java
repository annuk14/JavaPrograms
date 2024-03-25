package JavaPrograms;

import java.util.Arrays;

public class SegregateEvenOddNumber {

	public static void main(String[] args) {

		int a[]= {1,7,2,9,4};
		segregateEvenOddNumber(a);
	}
	
	public static void segregateEvenOddNumber(int a[]) {
		int eC=0;
		int oC=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				eC++;
			}else {
				oC++;
			}
		}
		int evenArr[]=new int[eC];
		int oddArr[]=new int[oC];
		int evenC=0,oddC=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			evenArr[evenC++]=a[i];
		}else {
			oddArr[oddC++]=a[i];
		}
	}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));


		

}
}