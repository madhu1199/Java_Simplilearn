package com.assistedproject;

public class Constructor {
	
	int employeeID;
	String name;
	void show() {
    System.out.println(employeeID +" : "+ name);
	}

	public static void main(String[] args) {
		Constructor employee1 = new Constructor();
		employee1.show();//default constructor give values 0 and null

        paraConstructor employee2 = new paraConstructor(25, "Masu");

	}

}
class paraConstructor{
	int employeeID;
	String name;
	paraConstructor(int employeeID,String name) {// parametrized constructor
		this.employeeID=employeeID;
		this.name=name;
		System.out.println(employeeID +" : "+ name);
	}

}
