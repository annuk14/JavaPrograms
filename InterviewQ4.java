package JavaPrograms;


public class InterviewQ4 {

	public static void main(String[] args) {

		String s="a4bc2c";//aaaabcbcc
		decompressString(s);
	}

	
	public static void decompressString(String s) {
		
		int x=0;
		int c=0;
		String tempS="";
		String output="";
		for(int i=0;i<s.length();i++) {
			x++;
		if(!Character.isDigit(s.charAt(i))) {
			tempS+=s.charAt(i);
		}
		else {
			c=s.charAt(i)-'0';
			for(int j=0;j<c;j++) {
				output+=tempS;
			}
			tempS="";
		}
		if(x==s.length()) {
			output+=tempS;
		}
		
		
		
		
	}
		System.out.println(output);
	}
}