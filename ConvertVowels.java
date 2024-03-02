package JavaPrograms;


public class ConvertVowels {

	public static void main(String[] args) {

		convertVowels("GeeksforGeeks");
		convertVowel("javatesting");
	}
	
	/**
	 * Program to convert vowels into uppercase:1st way
	 */
	//@TC:O(n)
	//@AS:O(1)
	
	public static void convertVowels(String s) {
		
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(isVowel(a[i])) {
				a[i]-=32;
			}
		}
		System.out.println(new String(a));
	}
	
	public static boolean isVowel(char ch) {
		
		return ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ;
				
	}
	
	/**
	 * Program to convert vowels into uppercase:2nd way
	 */
	
	public static void convertVowel(String s) {
		
		String vowels="aeiouAEIOU";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(vowels.indexOf(a[i])!=-1) {
				a[i]-=32;
			}
		}
		System.out.println(new String(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
