package com.logical;
import java.util.Scanner;
public class PowerOftwo {
	public static void main(String[] args) {
	       
		int a = 1,i;
	        System.out.print("Enter value with in 30 to print table of power of 2: ");
	        
	        Scanner sc = new Scanner(System.in);
	        Long b=sc.nextLong();
	        
	        if(b<=30) {
	        	
	        for ( i = 1;i<=b; i++) {
	            a = a * 2;
	            System.out.println("2 ^ " + i + " = " + a);
	        	}
	        }
	        
	        else
	        	System.out.println(b+ " overflow of integer");
    }
}
