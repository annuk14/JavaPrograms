package JavaPrograms;

import java.util.Arrays;

public class Segregrate0s1s2s {

	public static void main(String[] args) {

		int a[]= {1,0,2,2,1,0,2};
//		int a[]= {1,0,2};
		segregateArr(a);
		segregateArray(a);
	}
	
	
	//@ 1st way
	public static void segregateArray(int a[]) {
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	
	}

	//@2nd way:optimised solution 
	public static void segregateArr(int a[]) {
		
		int low=0;
		int mid=0;
		int high=a.length-1;
		int temp=0;
		
		while(mid<=high) {
			switch(a[mid]) {
			case 0:{
				 temp=a[low];
				a[low]=a[mid];
				a[mid]=temp;
				low++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
				
			case 2:{
				temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
				break;
			}
				
			
		}
				
	}
		System.out.println(Arrays.toString(a));
		}
	}


