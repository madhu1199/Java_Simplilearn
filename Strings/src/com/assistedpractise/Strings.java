package com.assistedpractise;

public class Strings {
	
	public static void main(String[] args) {
		String name="Balayya";   //creating a string 
		
        //methods of strings		
		//to find length of string
		System.out.println(name.length());

		//substring
		System.out.println(name.substring(2));


		// to find string  IsEmpty or Not
			String a="s";
		System.out.println(a.isEmpty());

		//converting toLowerCase
		String a1="Helloeveryone";
		System.out.println(a1.toLowerCase());
		
		//converting toUpperCase
		String a2="helloeveryone";
		System.out.println(a2.toUpperCase());
		

		//replacing a word from string
		String name3="Suresh";
		System.out.println(name3.replace('e', 'f'));
		

		//checking both string are equal or not
		String i="Welcome tO mY World";
		String j="Welcome to my WorLd";
		System.out.println(i.equals(j));
		
		
 
		System.out.print("\n");
		System.out.println("StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer greet=new StringBuffer("Hello!");
		greet.append("what Are You Doing");
		System.out.println(greet);

		//inserting a word 'h' in greet string
		greet.insert(0, 'h');
		System.out.println(greet);

		//replacing a word 'Por' in place of 'Akhanda'
		StringBuffer s1=new StringBuffer("Akhanda!");
		s1.replace(0, 2, "Por");
		System.out.println(s1);

		//deleting a word from string
		s1.delete(0, 2);
		System.out.println(s1);	
		
		//StringBuilder
		System.out.print("\n");
		System.out.println("StringBuilder");
		StringBuilder s2=new StringBuilder("Hey WhatsApp");
		s2.append("balayya");
		System.out.println(s2);
        //deleting 1st char in s2    
		System.out.println(s2.delete(0, 1));
		
        //inserting "welcome" in s2 string
		System.out.println(s2.insert(2, "GoodBye"));
        //reverse a string s2
		System.out.println(s2.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder\n");
		String greets = "Hello all How Are You"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer buffer = new StringBuffer(greets); 
        buffer.reverse(); 
        
        System.out.println(buffer); 
          
        // conversion from String object to StringBuilder 
        System.out.println();
        StringBuilder builder = new StringBuilder(greets); 
        builder.append("Heaven"); 
        
        System.out.println(builder);              


      }

	}

