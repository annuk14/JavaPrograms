package JavaPrograms;


public class InterviewQ5 {

	public static void main(String[] args) {

		countWord("i like java and i","i");
		countWord("test web app and test mobile app","app","test");

	}
	
	/**
	 * java program to count occurence of specfic word in sentence
	 */
	
	
     public static void countWord(String s,String word) {
		
		int c=0;
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) {
				if(a[i].equals(word)) {
					c++;
				}
			}
		System.out.println(c);

		}
		

	
	public static void countWord(String s,String word,String word2) {
		
		int c=0;
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) {
				if(a[i].equals(word) || a[i].equals(word2)) {
					c++;
				}
			}
		System.out.println(c);

		}
		

	}


