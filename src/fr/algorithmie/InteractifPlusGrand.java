package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int[] myValues = new int[10];
		
		int max = 0, myValue;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Saisir la valeur n°" + i + " : ");
			myValue = scanner.nextInt();
			if (i==1) {
				max = myValue;
			}
			else if (myValue > max) {
				max = myValue;
			}
		}
		
		System.out.println("\nMaximum : " + max);
		scanner.close();

	}

}
