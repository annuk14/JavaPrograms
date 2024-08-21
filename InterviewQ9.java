package JavaPrograms;

public class InterviewQ9 {

	public static void main(String[] args) {

		replace("Hello Interview is Going On Now");
		replaceCase("Hello Interview is Going On Now");
	}
	
	public static void replace(String s) {
		
		String output="";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				output+=(char)(s.charAt(i)+32);
			}else {
				output+=s.charAt(i);
			}
		}
		System.out.println(output);
		
		
	}
	
	public static void replaceCase(String s) {
		
		String output="";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]>=65 && a[i]<=90) {
				output+=(char)(a[i]+32);
			}else {
				output+=a[i];
			}
		}
		System.out.println(output);
	}


}
