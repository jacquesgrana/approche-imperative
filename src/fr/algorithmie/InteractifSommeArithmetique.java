package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		int myValue, sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Saisir une valeur supérieure à 0 ");
			myValue = scanner.nextInt();
		}
		while (myValue < 1);
		
		scanner.close();
		System.out.println();
		
		for(int i=1; i<= myValue; i++) {
			sum += i;
		}
		System.out.println("Somme des entiers compris entre 1 et " + myValue + " : " + sum);
	}

}
