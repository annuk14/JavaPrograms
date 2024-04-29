package JavaPrograms;

public class InterviewQ8 {

	
	public static void main(String[] args) {
		
		reverseString("Hello#1234");

}
	
	//String s="Hello#1234"
	//@output:olleH#4321
 
   public static void reverseString(String s) {
	   //Hello#1234
	   
	   String output="";
	   String a[]=s.split("#");
	   output+=reverse(a[0])+"#"+reverse(a[1]);
	   System.out.println(output);
	   
   }
   
   public static String reverse(String s) {
	   String rev="";
	   for(int i=s.length()-1;i>=0;i--) {
		   rev+=s.charAt(i);
	   }
	   return rev;
   }

}
