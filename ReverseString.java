package JavaPrograms;

/**
 * Program to reverse string in a stringwithdigits
 */

public class ReverseString {

	public static void main(String[] args) {

		revString("java12test29");
	}

	
	
	public static void revString(String s) {
		
		StringBuilder sb=new StringBuilder();
		int j=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!Character.isDigit(ch)) {
				sb.insert(j, ch);
			}else {
				sb.append(ch);
				j=i+1;
			}
		}
		System.out.println(sb.toString());
		
		
	}
}
