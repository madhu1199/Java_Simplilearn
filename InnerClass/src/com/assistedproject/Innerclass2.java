package com.assistedproject;

abstract class AnonymousInnerClass {
	   public abstract void display();
	}

public class Innerclass2 {

	public static void main(String[] args) {
		AnonymousInnerClass name = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      name.display();

	}

}