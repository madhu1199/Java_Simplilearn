package com.mphasis;

public class Parent extends Object{
	
	 Parent m1() {
		
		System.out.println("m1() from parent..");
		
		return null;
	}
	 
	public Parent() {
		super();        // calling Object()
		System.out.println("Parent() parent object created..");		
		
	}
	
	public	class  Demo{
		
		 public void demo() {
			 
			 System.out.println("demo from inner class");
		 }	
	}
}