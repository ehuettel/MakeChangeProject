package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("What is the total of your purchase: ");
		double purchaseTotal = kb.nextDouble();
		System.out.print("What is the amount tendered: ");
		double tenderedTotal = kb.nextDouble();
		if (tenderedTotal < purchaseTotal)
			System.out.println("Insufficient Funds");
		
		
		
		
		
		kb.close();
	}

}
