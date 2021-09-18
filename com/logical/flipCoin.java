package com.logical;
import java.util.Random;
import java.util.Scanner;
public class flipCoin {
	public static void main(String[] args) {

		int headCouner = 0, tailCounter = 0;
		double percentOfHead = 0, percentOfTail = 0;

		Scanner s = new Scanner(System.in);
		Random a = new Random();

		System.out.print("Enter number of times for flip coin: ");
		int inp = s.nextInt();

		for (int i = 1; i <= inp; i++) {
			
			int ran = a.nextInt(2);
			
			if (ran == 0) {
				System.out.println(i + ": Head");
				headCouner += 1;

			} else {
				System.out.println(i + ": Tail");
				tailCounter += 1;

			}

		}
		percentOfHead = (float) headCouner / inp * 100;
		percentOfTail = (float) tailCounter / inp * 100;
		
		System.out.println("Total head: " + headCouner);
		System.out.println("Total Tail: " + tailCounter);
		
		System.out.println("Percentage of head: " + percentOfHead + " %");
		System.out.println("Percentage of tail: " + percentOfTail + " %");
	}

}

