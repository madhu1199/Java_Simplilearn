package com.assistedpractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		String pattern = "[a-z]+";
		String check = "balayya";
		Pattern var = Pattern.compile(pattern);
		Matcher word = var.matcher(check);
		
		
		//condition check using find() method
		while (word.find())
	      	System.out.println( check.substring( word.start(), word.end() ) );
	}	

}
