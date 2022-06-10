package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int nbBaton = 21, choice, turn = 1;
		int choiceCont = 0;
		
		do {
			
			// TODO ajouter si reste un baton : perdu
			if(nbBaton <= 1) {
				System.out.println("\nPerdu !!");
				quit = true;
				break;
			}
			
			displayTitle(turn);
			displayGame(nbBaton);
			displayMenu();
			
			do {
				choice = scanner.nextInt();
			} while (choice < 0 || choice > 4);
			
			if (choice == 4) {
				quit = true;
			}
			else {
				nbBaton -= choice;
				if(nbBaton < 1) {
					nbBaton = 1;
				}
			}
			
			// TODO si il reste un baton : gagné
			if(nbBaton <= 1) {
				System.out.println("\nGagné !!");
				quit = true;
				break;
			}
			
			displayGame(nbBaton);
			
			// TODO attendre appui touche
			
			System.out.println("\nContinuer : 1");
			do {
				choiceCont = scanner.nextInt();
			}
			while (choiceCont != 1);
			
			System.out.println("\nL'ordinateur joue :");
			
			// tirage nombre aleatoire entre 1 et 3
			int random = (int) Math.round(Math.random()*3);
			// affecter nombre de batons
			nbBaton -= random;
			if(nbBaton < 1) {
				nbBaton = 1;
			}
			
			turn++;
		}
		while (!quit);
		System.out.println("\nFin du programme.");
		scanner.close();
	}
	
	private static void displayTitle(int turn) {
		System.out.println("\n*** Jeu des batons / Tour n° : " + turn + " ***");
	}
	
	private static void displayGame(int nbBaton) {
		System.out.println("\n");
		for(int i=1; i<=nbBaton; i++) {
			System.out.print("| ");
		}
		System.out.println("(" + nbBaton + ")\n");
	}
	
	private static void displayMenu() {
		System.out.println("\nMenu : Saisir le nombre de batons à enlever (de 1 à 3) ou (4) pour quitter :");
	}

}
