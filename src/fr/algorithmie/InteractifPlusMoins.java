package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 1, numberPlayed = 0;
		int numberToFind = (int) Math.round(Math.random()*100);
		
		if(numberToFind < 1) {
			numberToFind = 1;
		}
		if(numberToFind > 100) {
			numberToFind = 100;
		}
		
		do {
			System.out.println("Tour n°" + count +" : Saisir un nombre entre 1 et 100 : ");
			numberPlayed = scanner.nextInt();
			if (numberPlayed == numberToFind) {
				System.out.println("Bravo, vous avez gagné en " + count + " tours !!");
			}
			else if (numberPlayed > numberToFind) {
				System.out.println("Le nombre à trouver est inférieur !");
			}
			else if (numberPlayed < numberToFind) {
				System.out.println("Le nombre à trouver est supérieur !");
			}
			count++;
		}
		while (numberPlayed != numberToFind);
		
		scanner.close();
	}

}
