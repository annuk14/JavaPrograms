package JavaPrograms;

public class PrintNum {

	public static void main(String[] args) {

//		printNum();
		printNums();
	}
	
	
	//print 1 to 100 without using numbers
	public static void printNum() {
		
		int zero='A'/'A';
		String hundred="..........";
		for(int i=zero;i<=(hundred.length()*hundred.length());i++) {
			System.out.println(i);
			
		}
		
	}
	
	//print 1 to 100 without using numbers
    public static void printNums() {
		
		int zero='A'/'A';
		for(int i=zero;i<='d';i++) { //using ascii value of d i.e d=100
			System.out.println(i);
		}
	}


}
