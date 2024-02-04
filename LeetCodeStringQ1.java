package JavaPrograms;

public class LeetCodeStringQ1 {

	public static void main(String[] args) {

		//@output:"blue is sky the"
		String s="the sky is blue";
//		System.out.println(revString(s));
//		System.out.println(revString("  i  like  java  "));
		

	}
	
	public static String revString(String s) {
		
		String rev="";
		String a[]=s.trim().split("\\s+");
		for(int i=a.length-1;i>0;i--) {
			rev+=a[i]+" ";
		}
		return rev+a[0];
	}

}
