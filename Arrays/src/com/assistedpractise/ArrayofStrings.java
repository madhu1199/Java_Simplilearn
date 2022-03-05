package com.assistedpractise;

import java.util.Scanner;

public class ArrayofStrings {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no;
		Scanner input = new Scanner(System.in);
		System.out.println("How Many Friends  : ");
		no = input.nextInt();
		input.skip(System.lineSeparator());
		String []names=new String[no];
		for(int value=0; value<no; value++) {
			System.out.println("Names Of Friends : "+(value+1));
			names [value]=input.nextLine();
				}
		input.close();
		System.out.println("Friends Are:");
		for(int value =0; value<no; value++) {
			System.out.println(names[value]);
		
		}	
		

	}

}
