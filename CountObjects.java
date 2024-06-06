package JavaPrograms;

public class CountObjects {
	
	
//1st way:using constructor:
	
	static int c=0;

	CountObjects(){
		c++;
	}
	

//2nd way:using instance block:

	{
		c++;

	}

		
	
public static void main(String[] args) {
	
	CountObjects co1=new CountObjects();
	CountObjects co2=new CountObjects();
	CountObjects co3=new CountObjects();
	CountObjects co4=new CountObjects();
	CountObjects co5=new CountObjects();
	System.out.println(c);


}
}


