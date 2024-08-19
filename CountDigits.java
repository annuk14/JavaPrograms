package JavaPrograms;

public class CountDigits {

	public static void main(String[] args) {

		countDigits(12345);
		countDigits(11111);
		countDigits(1234589,0);
		countDigits(3989,0);
		countDigits(123457777);

	}
	
	public static void countDigits(int num) {
		
		int c=0;
		while(num>0) {
			int r=num%10;
			c++;
			num=num/10;
		}
		System.out.println(c);
	}
	
	//TC:O(log10N + 1) where N is the input number. the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
	//In each iteration of the while loop we perform constant time operations like division and increment the counter.
	//SC: O(1) 
	public static void countDigits(int num,int counter) {
		
		while(num>0) {
			counter++;
			num=num/10;
			
		}
		System.out.println(counter);
	}


}
