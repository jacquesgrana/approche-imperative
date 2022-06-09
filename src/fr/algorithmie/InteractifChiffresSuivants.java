package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		int myValue;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir une valeur : ");
		myValue = scanner.nextInt();
		scanner.close();
		
		System.out.println();
		for(int i=1; i<= 10; i++) {
			System.out.print((myValue+i) + ", ");
		}
	}

}
