package com.mphasis.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
	    Double  num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: \n");      
        num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: \n");  
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator ( +,-, *, /):  \n");
        char operator = scanner.next().charAt(0);

        scanner.close();
        Double  output;

        switch(operator)
        {
            case '+':
            	
            	System.out.println("Addition is ");
            	output = num1 + num2;
                break;
                
            case '-':
            	
            	System.out.println("Subtraction is ");
            	output = num1 - num2;
                break;

            case '*':
            	System.out.println("Multiplication is ");
            	output = num1 * num2;
                break;

            case '/':
            	System.out.println("Division is ");
            	output = num1 / num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+"= "+output);
    }
	}
