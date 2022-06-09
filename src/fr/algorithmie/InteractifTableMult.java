package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		int myValue;
		Scanner scanner = new Scanner(System.in) ;
		
		do {
			System.out.println("Saisir une valeur entre 1 et 10 : ");
			myValue = scanner.nextInt();
		}
		while (myValue < 1 || myValue > 10);
		
		System.out.println("\nTable de " + myValue);
		
		for (int i=1; i<=10; i++) {
			System.out.println("\n" + myValue + " x " + i + " = " + (myValue*i));
		}
	}

}
