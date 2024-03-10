package JavaPrograms;


public class InterviewQ3 {

	public static void main(String[] args) {

		String s="tomorrow";
		print(s);
		
	}
	/**
	 * Program to print string in given pattern
	 */
//@output:
	
//	t*
//	m**
//	rr***w 
	
	
	
	public static void print(String s) {
		
		char a[]=s.toCharArray();
		int c=0;
		String output="";
		for(int i=0;i<a.length;i++) {
			if(a[i]=='o') { 
				c=c+1;
			
			for(int j=0;j<c;j++) {
				System.out.print("*");
			}
			if(c!=3) {
				System.out.println();
			}
			}else {
			System.out.print(a[i]);

		}

	}

	}
	}

