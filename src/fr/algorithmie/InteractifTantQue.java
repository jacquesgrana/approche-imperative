package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		int myValue;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Saisir une valeur entre 1 et 10 : ");
			myValue = scanner.nextInt();
		}
		while (myValue < 1 || myValue > 10);
		
		System.out.println("\nValeur choisie : " + myValue);
		scanner.close();
	}

}
