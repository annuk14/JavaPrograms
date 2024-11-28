package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PrintNum {
	
	/**
	 * Program to print number starts with 1
	 */
	

	public static void main(String[] args) {

		int a[]= {1,45,123,167,98};
		getNumStartsWithOne(a);
		getNumStartsWithOne2(a);
		getNumStartsWithOne3(a);
		
	}
	
	public static int getNum(int num) {
		
		while(num>=10) {
			num=num/10;
		}
		return num;
	}
	
	//1st way
	public static void getNumStartsWithOne(int a[]) {
		
		List<Integer>numList=new ArrayList<Integer>();
		for(int num:a) {
			if(getNum(num)==1) {
				numList.add(num);
			}
			
		}
		System.out.println(numList);
	}
	
	//2nd way
	public static void getNumStartsWithOne2(int a[]) {

		List<Integer>numberList=new ArrayList<>();
		for(int i:a) {
			if(String.valueOf(i).startsWith("1")) {
				numberList.add(i);
			}
		}
		System.out.println(numberList);

	
	}
	
	//3rd way
	public static void getNumStartsWithOne3(int a[]) {
		
		List<Integer>numberList=Arrays.stream(a).mapToObj(e->String.valueOf(e)).filter(e->e.startsWith("1")).map(e->Integer.parseInt(e)).collect(Collectors.toList());
	    System.out.println(numberList);
	
	}

	
	
	
	
	
	
	
	
	
	
}
