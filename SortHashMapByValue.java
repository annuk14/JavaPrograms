package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortHashMapByValue {

	public static void main(String[] args) {

		sortHashMap();
	}

	/**
	 * Program to sort HashMap by values
	 */
	
	
	public static void sortHashMap() {
		
		HashMap<Integer,String>map=new HashMap<>();
		map.put(100, "tom");
		map.put(200, "steve");
		map.put(99, "lisa");
		map.put(400, "peter");
		
		//1st way:using java 8 comparingByValue()
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
			
		//2nd way:using java 8 stream
		map.entrySet().stream().sorted((k1,k2)->k1.getValue().compareTo(k2.getValue())).forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
		
		//3rd way:using comparator 
		ArrayList<Map.Entry<Integer,String>>li=new ArrayList<>(map.entrySet());
		Collections.sort(li,new Comparator<Map.Entry<Integer,String>>(){
		public int compare(Map.Entry<Integer,String>k1,Map.Entry<Integer,String>k2) {
			return k1.getValue().compareTo(k2.getValue());
		
		}
		});
		
	    for(Entry<Integer,String>e:li) {
		System.out.println(e.getKey()+":"+e.getValue());
	}
	
	}
}

