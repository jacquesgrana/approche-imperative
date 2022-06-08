package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("ordre normal (index : valeur) : ");
		for(int i=0; i<myArray.length; i++) {
			System.out.println((i) + " : " + myArray[i]);
		}
		
		System.out.println();
		System.out.println("ordre inverse (index : valeur) : ");
		
		for(int i  = myArray.length-1; i>=0; i--) {
			System.out.println((i) + " : " + myArray[i]);
		}
		
		System.out.println();
		System.out.println("entiers du tableau supérieurs à 3 (index : valeur) : ");
		for(int i=0; i<myArray.length; i++) {
			if (myArray[i] > 3) {
				System.out.println((i) + " : " + myArray[i]);
			}
 			
		}
		
		System.out.println();
		System.out.println("entiers du tableau pairs (index : valeur) : ");
		for(int i=0; i<myArray.length; i++) {
			if (myArray[i] % 2 == 0) {
				System.out.println((i) + " : " + myArray[i]);
			}
 			
		}
		
		System.out.println();
		System.out.println("valeurs des index pairs (index : valeur) : ");
		for(int i=0; i<myArray.length; i++) {
			if (i % 2 == 0) {
				System.out.println((i) + " : " + myArray[i]);
			}
 			
		}
		
		System.out.println();
		System.out.println("entiers du tableau impairs (index : valeur) : ");
		for(int i=0; i<myArray.length; i++) {
			if (myArray[i] % 2 != 0) {
				System.out.println((i) + " : " + myArray[i]);
			}
 			
		}

	}

}
