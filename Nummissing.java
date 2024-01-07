package org.pc.com;

import java.util.Arrays;

public class Nummissing {

	public static void main(String[] args) {

		int num[]= {1,2,3,5};
		System.out.println(findMissingNum(num,5));
	}
	
	public static int findMissingNum(int num[],int totalCount) {
		
		Arrays.sort(num);
		int ExpSum=totalCount*(totalCount+1)/2;
		int actualSum=0;
		for(Integer i:num) {
			actualSum+=i;
		}
		return ExpSum-actualSum;
	}
}
