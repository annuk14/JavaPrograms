package JavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {

//		reverseNumber(1234567);
//		reverseNumber(11);
//		reverseNumber(01);
//		reverseNumber(001);

      reverseNumRecursion(123);

	}
	 
	public static void reverseNumber(int num) {
		
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	public static void reverseNumRecursion(int num) {
		
		if(num<10)
			System.out.println(num);
		else
			System.out.println(num%10);
		   reverseNumRecursion(num/10);
	}


}
