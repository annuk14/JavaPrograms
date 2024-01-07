package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PrintArray {

	public static void main(String[] args) {

		int a[]= {4,5,2,3,4,4,5,7};
//		printArrDesc(a);
		printArrDescStream(a);
	}
    
	//1st way.
	//print array in descending order without duplicates
	public static void printArrDesc(int a[]) {
		
	List<Integer>list=new ArrayList<>();	
		for(int i:a) {
			list.add(i);
		}
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("after sorting in descending order:");
		System.out.println(list);
		LinkedHashSet<Integer>unique=new LinkedHashSet<>(list);
		System.out.println(unique);
	}
	
	//2nd way.
	public static void printArrDescStream(int a[]) {
		List<Integer>list=new ArrayList<>();	
		for(int i:a) {
			list.add(i);
		}
//		Arrays.stream(a).sorted().distinct().forEach(System.out::println);
		List<Integer>un=list.stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(un);
	}

}
