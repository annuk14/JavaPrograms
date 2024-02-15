package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class ConvertArrtoList {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
//		arrToList(a);
		String ar[]= {"tom","lisa"};
//		arrToList1(ar);
		arrToList2(ar);
		arrToList3(ar);
		arrToList4(ar);
		arrToList5(ar);
		
	}
	
	/**
	 * Program to convert Array to ArrayList:1st way
	 */
	//mutable list i.e we can add or remove values
	public static void arrToList(int a[]) {
		
		List<Integer>list=new ArrayList<Integer>();
		for(int i:a) {
			list.add(i);
		}
		System.out.println(list); //mutable list
		list.add(7); 
		list.add(13);
		System.out.println(list);

	}
	
	/**
	 * Program to convert Array i.e String array to ArrayList: 1st way
	 */
	
	//using Arrays.asList() method
	public static void arrToList1(String a[]) {
		
		List<String>list=Arrays.asList(a);
		System.out.println(list);
		
	}
	
	/**
	 * Program to convert Array i.e String array to ArrayList: 2nd way
	 */
	
	//using add() method
	public static void arrToList2(String a[]) {
		
		List<String>list=new ArrayList<String>();
        for(String e:a) {
        	list.add(e);
        }
        System.out.println(list);
        
	}
		
	/**
	 * Program to convert Array i.e String array to ArrayList: 3rd way
	 */
	
	//using Collections.addAll() method	
	public static void arrToList3(String a[]) {

		List<String>list=new ArrayList<String>();
        Collections.addAll(list, a);
        System.out.println(list);
			
		
	}
	
	
	/**
	 * Program to convert Array i.e String array to ArrayList: 4th way
	 */
	
	//using java 8 :convert array into mutable list
	public static void arrToList4(String a[]) {


		List<String>list=Arrays.stream(a).collect(Collectors.toList());
		System.out.println(list);
		list.add("steve");
		list.add("peter");
		System.out.println(list);
	
	}
		
	/**
	 * Program to convert Array i.e String array to ArrayList: 5th way
	 */
	
	    //	//using java 9 List.of() method :convert array into immutable list i.e we cannot add or remove values from list

		public static void arrToList5(String a[]) {

		List<String>list=List.of(a);
		System.out.println(list);//immutable list
		list.add("steve");
		list.add("peter");
		System.out.println(list);
	
		
		
		
		
		
		
		
		
		
		
		

}
}