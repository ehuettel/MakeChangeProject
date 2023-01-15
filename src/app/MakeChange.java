package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("What is the total of your purchase: ");

		double purchaseTotal = kb.nextDouble();

		System.out.print("What is the amount tendered: ");

		double tenderedTotal = kb.nextDouble();

		double change = tenderedTotal - purchaseTotal;

		if (tenderedTotal < purchaseTotal) {

			System.out.print("Insufficient Funds");

		} else if (tenderedTotal == purchaseTotal) {

			System.out.print("Transaction complete, have a nice day!");

		} else {

			System.out.println("Your total change is $" + (float) change);
			
		}

		double remainder = change + .005;

		if (remainder >= 20) {

			int twenties = (int) remainder / 20;
			
			remainder %= 20;

			System.out.println(twenties + " twenty dollar bill(s)");

		}

		if (remainder >= 10) {

			int tens = (int) remainder / 10;

			remainder %= 10;

			System.out.println(tens + " ten dollar bill(s)");

		}

		if (remainder >= 5) {

			int fives = (int) remainder / 5;

			remainder %= 5;

			System.out.println(fives + " five dollar bill(s)");

		}

		if (remainder >= 1) {

			int ones = (int) remainder / 1;

			remainder %= 1;

			System.out.println(ones + " one dollar bill(s)");

		}

		if (remainder >= .25) {

			double quarters = (double) remainder / .25;

			remainder %= .25;

			System.out.println((int) quarters + " quarter(s)");

		}

		if (remainder >= .10) {

			double dimes = (double) remainder / .10;

			remainder %= .10;

			System.out.println((int) dimes + " dime(s)");

		}

		if (remainder >= .05) {

			double nickels = (double) (remainder) / .05;

			remainder %= .05;

			System.out.println((int) nickels + " nickel(s)");

		}

		if (remainder >= .01) {

			double pennies = (float) (remainder) / .01;

			System.out.println((int) (pennies) + " penny(ies)");

		}

		kb.close();
	}

}
