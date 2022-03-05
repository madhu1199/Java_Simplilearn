package com.assistedpractise;

public class Multi {
public static void main(String[] args) {
		
		//Single-Dimensional Array
		int[] single = {11,12,13,14,15,16,17,18,19};
		System.out.println("The elements in single dimensional array are : ");
		for (int i=0;i<9;i++)
			System.out.print(single[i]+ " ");
		
		//Multi-Dimensional array
		int[][] multi = {{2,3,4},{7,8,9},{18,19,20}};
		System.out.println();
		System.out.println("The elements in multi dimensional array are : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multi[i][j]+ " ");
			}
			System.out.println();
		}
	}	

}
