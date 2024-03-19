package JavaPrograms;

public class InterviewQ6 {

	public static void main(String[] args) {

		countOccurence("i love india",'i');
		countOccurences("i love india and",'i','a');
		
	}
	
	public static void countOccurence(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static void countOccurences(String s,char c,char c2) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c || s.charAt(i)==c2) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
