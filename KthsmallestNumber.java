package JavaPrograms;

import java.util.Arrays;
import java.util.PriorityQueue;



public class KthsmallestNumber {

	public static void main(String[] args) {

		int a[]= {1,3,2,7,8,4,5};
		int k=4;
		kthSmallestNum(a,k);
		kthSmallestNumber(a,k);
	}
	
	/**
	 * find kth smallest number in an array 
	 */
	
	public static void kthSmallestNum(int a[],int k) {
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("index of "+k+" smallest number is:"+a[k-1]);
	}
	
	/**
	 * find kth smallest number in an array :using min heap (PriorityQueue)
	 */

	
	 public static void kthSmallestNumber(int a[],int k) {
		 
		 PriorityQueue<Integer>pq=new PriorityQueue();
		 for(int i=0;i<a.length;i++) {
			 pq.add(a[i]);
		 }
		 int f=k-1;
		 while(f>0) {
			 pq.remove();
			 f--;
		 }
		 System.out.println("index of "+k+" smallest number is:"+pq.peek());
	 }


}
