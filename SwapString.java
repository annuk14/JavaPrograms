package JavaPrograms;


public class SwapString {

	public static void main(String[] args) {

		swapString("hello","world");
		swapStrings("hello","world");

	}
	
	/**
	 *  Swap String without using third var
	 */
	
	public static void swapString(String a,String b) {
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
	}

	
	/**
	 *  Swap String using third var
	 */
	
	public static void swapStrings(String a,String b) {
		
		String temp="";
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);

	}

}
