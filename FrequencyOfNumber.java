package JavaPrograms;

public class FrequencyOfNumber {

	//frequency(count) of 4
	public static void main(String[] args) {

		int a[]= {244,449,469,984};
		int a1[]= {444,4,004,111};
		int a2[]= {0,0,4,1};
		int a3[]= {0};
		int a4[]= {1};
		int a5[]= {4444444};
		int a6[]= {44};
		int a7[]= {444,444};

		findFrequency(a);
		findFrequency(a1);
		findFrequency(a2);
		findFrequency(a3);
		findFrequency(a4);
		findFrequency(a5);
		findFrequency(a6);
		findFrequency(a7);


	}
	
	public static void findFrequency(int a[]) {
		
		int counter=0;
		for(int num:a) {
			counter+=getCount(num);//0+2+2+1+1
		}
		System.out.println(counter);
		
	}
	
	public static int getCount(int num) {
		
		int c=0;
		while(num!=0) {
			int rem=num%10;
			if(rem==4) {
				c++;
			}
			num=num/10;
		}
		return c;
	}
	
}

