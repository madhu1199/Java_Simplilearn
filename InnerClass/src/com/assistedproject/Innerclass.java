package com.assistedproject;

public class Innerclass {
	
	private String name="Welcome To  Home"; 
	 
	 class Inner{  
	  void greetings(){System.out.println(name+", Let's Have A Cup Of Tea ");}  
	 }  

	public static void main(String[] args) {
		Innerclass object=new Innerclass();
		Innerclass.Inner in=object.new Inner();  
		in.greetings();

	}
}
