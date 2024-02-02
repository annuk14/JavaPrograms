package JavaPrograms;


public class NumberSwap {
	
	
	public static void main(String[] args) {

		swapNum(10,5);
		swapNums(10,5);
		swapNumber(5,10);
	}
	
	
	/**
	 * Swap Numbers using arithmetic operator
	 */
	
	public static void swapNum(int n1,int n2) {
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println(n1+" "+n2);
		
	}
	
	/**
	 * Swap Numbers using division operator
	 */
	
   public static void swapNums(int a,int b) {
		
	   a=a*b;
	   b=a/b;
	   a=a/b;
	   System.out.println(a+" "+b);
		
	}
   
   
   /**
	 * Swap Numbers using bitwise operator
	 */
	
   

   public static void swapNumber(int a,int b) {
		
	   a=a^b;
	   b=a^b;
	   a=a^b;
	   System.out.println(a+" "+b);
		
	}

}
