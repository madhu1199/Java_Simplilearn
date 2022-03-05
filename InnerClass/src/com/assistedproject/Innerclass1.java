package com.assistedproject;

public class Innerclass1 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }
	public static void main(String[] args) {
		Innerclass1  ob=new Innerclass1 ();  
		ob.display();  
		}


}
