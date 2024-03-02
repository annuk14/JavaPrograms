package JavaPrograms;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		countVowConDigiSc("geeks for geeks121");
		System.out.println(isConsonant('b'));
	}
	
	public static void countVowConDigiSc(String s) {
		int vC=0;
		int cC=0;
		int dC=0;
		int sC=0;
		
		for(int i=0;i<s.length();i++) {

           if(isVowel(s.charAt(i))) {
        	   vC++;
           }
           else if(s.charAt(i)>='a' && s.charAt(i)<='z')
        		   cC++;
        	   
		else if(s.charAt(i) >='0' && s.charAt(i)<='9') {
        		   
        	   dC++;
           }else {
        	   sC++;
           }
        	   
           }
			
		
		System.out.println("Vowels count:"+vC);
		System.out.println("Consonant count:"+cC);
		System.out.println("Digits count:"+dC);
		System.out.println("Special character count:"+sC);

		
	}
	
	public static boolean isVowel(char ch) {
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
			default:
				return false;
		}
	}

	
public static boolean isConsonant(char ch) {
		
		return (!(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'  || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')) ;
				
	}
	
}
