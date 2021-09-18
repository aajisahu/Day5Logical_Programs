package com.logical;
import java.util.*;
   public class PrimeFactor {
	   
      public static void main(String[] args) {
    	 
    	    Scanner sc=new Scanner(System.in);
    	    
	        System.out.print("Enter a number: ");
	        int number= sc.nextInt();
	        
	        System.out.print("prime factor are: ");
	       
	        	for (int i = 2; i <= number; i++) {
	        		
	        				while (number % i == 0) {
	        					System.out.print(i + " ");
	        					number = number / i;
	        				}
	        	}
      }
   
   
}
   
	        				
	          
	          
	        