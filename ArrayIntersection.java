package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,7,9,0};
		intersection(a1,a2);
		intersections(a1,a2);
	}


	//Array intersection using ArrayList

  public static void intersection(int a1[],int a2[]) {
	  
	  List<Integer>intersectList=new ArrayList<>();
	  for(int i=0;i<a1.length;i++) {
		  for(int j=0;j<a2.length;j++) {
			  if(a1[i]==a2[j]) {
				  intersectList.add(a1[i]);
			  }
		  }
		  Collections.sort(intersectList);
	  }
	  System.out.println(intersectList);
	  
  }

//Array intersection using Collections.retainAll() method
  public static void intersections(int a1[],int a2[]) {
	  
	  List<Integer>firstList=new ArrayList<>();
	  List<Integer>seconndList=new ArrayList<>();
	  for(int i=0;i<a1.length;i++) {
		  firstList.add(a1[i]);
	  }
	  for(int j=0;j<a2.length;j++) {
		  seconndList.add(a2[j]);
	  }
	  firstList.retainAll(seconndList);
	  System.out.println(firstList);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
  }