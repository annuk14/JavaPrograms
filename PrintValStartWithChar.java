package JavaPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintValStartWithChar {

	public static void main(String[] args) {

		printChar();
		printChars();

	}
	
	public static void printChar() {
		
		List<String>namesList=Arrays.asList("tom","lisa","tim","peter","tintin");
		for(String e:namesList) {
//			if(e.startsWith("t")) {
			if(e.contains("t")) {

				System.out.println(e);
			}
		}
	}
	
	public static void printChars() {
		
		List<String>namesList=Arrays.asList("tom","lisa","tim","peter","tintin");
		List<String>list=namesList.stream().filter(e->e.startsWith("t")).collect(Collectors.toList());
		System.out.println(list);

	}


              
}

