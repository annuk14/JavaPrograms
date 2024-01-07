package JavaPrograms;

public class PallindromeRange {

	public static void main(String[] args) {

		System.out.println(isPallinNumber(121));
		System.out.println(isPallinNumber(100));
		System.out.println(revNum(1234567));
		printPallindromeRange(100);
	}
	
	public static boolean isPallinNumber(int num) {
		
		int t=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(t==rev) {
		return true;

		}
		
		return false;
	}
	
	public static int revNum(int num) {
		
		int rev=0;
        while(num!=0) {
        	
			int rem=num%10;
		    rev=rev*10+rem;
		    num=num/10;
		    
		}
       return rev; 		
	}

	
	public static void printPallindromeRange(int num) {
		
		for(int i=1;i<=100;i++) {
			if(revNum(i)==i) {
				System.out.println(i+" ");
			}
				
			}
		}
	}

//}
