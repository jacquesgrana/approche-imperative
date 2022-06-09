package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbElemMax = 4, nbElem = 0, choice;
		int[] myTab = new int[nbElemMax];
		boolean quit = false;
		
		do {
			System.out.println("\nChoix / (1) : ajouter nombre / (2) : afficher tableau / (3) : quitter");
			choice = scanner.nextInt();
			
			
			switch (choice) {
			case 1 :
				System.out.println("Saisir le nombre à ajouter :");
				int valueToAdd = scanner.nextInt();
				myTab[nbElem] = valueToAdd;
				nbElem++;
				if (nbElem > nbElemMax-1) {
					// copier tableau dans temp
					int[] tempTab = new int[nbElemMax];
					for(int i=0; i<nbElemMax; i++) {
						tempTab[i] = myTab[i];
					}
					nbElemMax++;
					
					// init du tableau plus grand
					myTab = new int[nbElemMax];
					
					// copier temp dans tableau
					for(int i=0; i<nbElemMax-1; i++) {
						myTab[i] = tempTab[i];
					}
				}
				break;
			case 2 :
				if(nbElem > 0) {
					System.out.println("\nAffichage du tableau :");
					for(int i=0; i<nbElem; i++) {
						System.out.println(myTab[i]);
					}
					
				}
				else {
					System.out.println("\nTableau vide !");
				}
				break;
			case 3 :
				quit = true;
				break;
			}
			
		}
		while (!quit);
		System.out.println("\nFin du programme");
		scanner.close();

	}

}
