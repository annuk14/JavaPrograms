package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagramString {

	public static void main(String[] args) {

		System.out.println(isAnagram("listen","silent"));
		System.out.println(isAnagram("lives","elvis"));
		System.out.println(isAnagram("cat","act"));
		System.out.println(isAnagram("rat","art"));
		System.out.println(isAnagram("triangle","integral"));
		System.out.println(isAnagram("triangle","integrate"));
		System.out.println(isAnagram("LISTEN","silent"));
		System.out.println(isAnagram("TRIANGLE","INTEGRAL"));
		System.out.println(isAnagram("triangle "," integral "));
		System.out.println(isAnagram("triangle","triangl"));

		System.out.println(isAnagrams("listen","silent"));
		System.out.println(isAnagrams("cat","act"));
		System.out.println(isAnagrams("listenn","silent"));
		System.out.println(isAnagrams("rat","art"));
		System.out.println(isAnagrams("lives","elvis"));
		System.out.println(isAnagram("triangle "," integral "));
		System.out.println(isAnagram("triangle","triangl"));

	}
	
	//1st way:using inbuilt methods i.e equals() & sort()
	public static boolean isAnagram(String s1,String s2) {
		
		s1=s1.replaceAll(" ","");
	    s2=s2.replaceAll(" ","");
	    
	    if(s1.length()!=s2.length()){
	    	return false;
	    }else {
	    	char a1[]=s1.toLowerCase().toCharArray();
	    	char a2[]=s2.toLowerCase().toCharArray();
	    	Arrays.sort(a1);
	    	Arrays.sort(a2);
	    
	    return Arrays.equals(a1, a2);
	    
		
	}
}

	
	//2nd way:using hashmap
	public static boolean isAnagrams(String s1,String s2) {
		
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		if(s1.length()!=s2.length()) {
			return false;
		}else {
			char a1[]=s1.toLowerCase().toCharArray();
			char a2[]=s2.toLowerCase().toCharArray();
			
			HashMap<Character,Integer>map1=new HashMap<>();
			for(char e1:a1) {
				if(map1.containsKey(e1)) {
					map1.put(e1, map1.get(e1)+1);
				}else {
					map1.put(e1,1);
				}
			}
			HashMap<Character,Integer>map2=new HashMap<>();
			for(char e2:a2) {
				if(map2.containsKey(e2)) {
					map2.put(e2, map2.get(e2)-1);
				}
			}

			for(Map.Entry<Character, Integer>outputMap:map2.entrySet()) {
				if(outputMap.getValue()!=0) {
					return false;
				}
			}
		}
	
		return true;

	}
}
