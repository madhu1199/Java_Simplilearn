package com.mphasis;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

			Object o =(Object) new Child(); //upcasting // runtime polymorphism
		
		Parent p = new Parent();
		
		//System.out.println(p);
		
		//Child  c = new Child();
		
		Child c = (Child) o; //down casting
		
		System.out.println(c);
		
		
		String str = new String();
		
		Object obj = str;
		
		String str2 =(String)obj;
				
		
		Parent p1 = new Parent();
		
		p1.m1();
	}
}

	
	

