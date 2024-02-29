package JavaPrograms;

public class InterviewQ2 {

	public static void main(String[] args) {

		int a[]= {1,1,0,0,1,1,1,0};
		int c1=0;
		int c2=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				c1++;
			}else {
				c2++;
			}
		}
		System.out.println("count of 0 is" +c1);
		System.out.println("count of 1 is" +c2);
	}
	

}
