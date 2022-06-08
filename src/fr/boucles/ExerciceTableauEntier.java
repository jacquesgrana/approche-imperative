package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		int[] tabInt = new int [10];
		for (int i=1; i<= 10; i++) {
			tabInt[i-1] = i;
			
		}
		
		System.out.println("1e élément du tableau : " + tabInt[0]);
		System.out.println();
		
		System.out.println("longueur du tableau : " + tabInt.length);
		System.out.println();
		
		System.out.println("dernier élément du tableau : " + tabInt[tabInt.length-1]);
		System.out.println();
		
		tabInt[4] = 8;
		System.out.println("élément d'index 4 du tableau modifié : " + tabInt[4]);
		System.out.println();

	}

}
