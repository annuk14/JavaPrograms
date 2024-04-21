package JavaPrograms;

public class InterviewQ7 {

	public static void main(String[] args) {

		printString("my name is tom");
	}
	
	public static void printString(String s) {
		
     //@output:MyNaMeIsToM

		
		String output="";
		s=s.replaceAll(" ", "");
		for(int i=0;i<s.length();i++) {
		if(i%2==0) {
				output+=Character.toUpperCase(s.charAt(i));
		}else {
				output+=s.charAt(i);
			}
					
		}
		System.out.println(output);
	}
		
		
		
}
