package JavaPrograms;

public class CountVowels {

	public static void main(String[] args) {

		System.out.println(isVowel('a'));
		System.out.println(isVowel('z'));
		countVowels("java");		
		countVowels("javajretestingtools");	

	}

	
	public static boolean isVowel(char ch ) {
		
		return (ch=='a' || ch=='e' ||ch=='i'  ||ch=='o'||ch=='u'||ch=='A'||ch=='E'
				||ch=='I'||ch=='O'||ch=='U');
	}
	
	public static void countVowels(String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(isVowel(ch)) {
				c++;
			}
		}
		System.out.println("total number of vowels in a string :"+c);
	}
	
	
		
		
		
		
	}
	

