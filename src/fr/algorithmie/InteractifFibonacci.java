package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int u2 = 0, u1 = 1, choice, result = 0;
		
		
		do {
			System.out.println("Saisir un entier supérieur à 1 :");
			choice = scanner.nextInt();
		} 
		while (choice <= 1);
		
		for(int i=2; i<=choice; i++) {
			result = u1 + u2;
			u2 = u1;
			u1 = result;
		}
		
		System.out.println("\nRésultat : " + result);
		
		
		scanner.close();
	}

}
