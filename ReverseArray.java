package JavaPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		revArr(a);
	}
	
	public static void revArr(int a[]) {
		
		int temp;
		for(int i=0;i<a.length;i++) {
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
