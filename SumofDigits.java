package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumofDigits {

	public static void main(String[] args) {

		System.out.println(sumOfDigit("testcasepassed100testcasefailed50testcaseskipped75"));
		sumOfDigitReg("tom12peter57");
	}

	
	public static int sumOfDigit(String s) {
		
		int sum=0;
		String temp="0";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) 
				temp+=ch;
			else {
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		return sum+Integer.parseInt(temp);
		
	}
	
	public static void sumOfDigitReg(String s) {
		
		String res=s.replaceAll("[^0-9]","");
		System.out.println(res);
		Pattern p=Pattern.compile(res);
		Matcher m=p.matcher(s);
		int sum=0;
		while(m.find()) {
            sum+=Integer.parseInt(res);
		}
		System.out.println(m.group());

	}

	
}
