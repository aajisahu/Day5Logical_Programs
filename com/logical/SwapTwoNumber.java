package com.logical;
import java.util.*;  
public class SwapTwoNumber {
	
	    public static void main(String[] args) {  
	      
	    	int num1, num2, swap;// x and y are to swap   
	       
	    	Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of 1st Number");  
	       //taking input for two number
	       num1 = sc.nextInt();  
	       System.out.println("Enter the value of 2nd Number");  
	       num2 = sc.nextInt();  
	       
	       System.out.println("before swapping numbers: "+num1+"  "+ num2);  
	       
	       //swapping  
	       swap = num1;  
	       num1 = num2;  
	       num2 = swap;  
	       System.out.println("After swapping: "+num1 +"   " + num2);  
	       System.out.println( );  
	    }    
}
