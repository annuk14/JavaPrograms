package JavaPrograms;

public class ReverseDigits {

	public static void main(String[] args) {

		revDigits(12345);
		revDigits(1234577);
		revDigits(001);
		revDigits(11111);
		revDigits(1000);
		revDigits(1);
		revDigits(0);






	}
	//12345
	public static void revDigits(int num) {
		
		int rev=0;
		while(num>0) {
			int a=num%10;
			 rev=rev*10+a;
			 num/=10;
		}
		System.out.println(rev);
	}

}
