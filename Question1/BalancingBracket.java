package com.gl.Question1;

import java.util.*;

public class BalancingBracket {

		   public static boolean isBalancedBrackets(String inputString) {
		        Stack<Character> stack = new Stack<>();
		        String openingBrackets = "([{";
		        String closingBrackets = ")]}";

		        for (char c : inputString.toCharArray()) {
		            if (openingBrackets.indexOf(c) != -1) {
		                stack.push(c);
		            } else if (closingBrackets.indexOf(c) != -1) {
		                if (stack.isEmpty()) {
		                    return false;
		                }
		                char lastOpeningBracket = stack.pop();
		                if (openingBrackets.indexOf(lastOpeningBracket) != closingBrackets.indexOf(c)) {
		                    return false;
		                }
		            }
		        }

		        return stack.isEmpty();
		    }
	 
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the string to check for balanced brackets: ");
		        String inputString = scanner.nextLine();

		        
		        if (isBalancedBrackets(inputString)) {
		            System.out.println("The entered String has Balanced Brackets");
		        } else {
		            System.out.println("The entered String does not contain Balanced Brackets");
		        }
		    }
        }
		    
		
