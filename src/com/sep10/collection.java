package com.sep10;
import java.util.List;
import java.util.ArrayList;
public class collection {
	
	public static void main(String[] args) {
		
		 List<Integer> marks=new ArrayList<Integer>();
		int []c= {1,2,3};
		marks.add(88);
		marks.add(78);
		marks.add(88);//hetrogenious l
		marks.add(76);
		marks.add(98);
		marks.add(58);
		marks.add(77);
		
		
		System.out.println(marks.contains(88));
		
		//System.out.println(marks.get(0));
		
		for(int i=0;i<marks.size();i++) {
			System.out.println(marks.get(i));
		}
		for(int i:marks) {
			System.out.println(i);
		}
	}
	

}
