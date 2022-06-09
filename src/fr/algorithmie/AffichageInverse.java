package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] myTab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("\nAffichage des éléments du tableau :");
		for (int i=0; i<myTab.length; i++) {
			System.out.println(myTab[i]);
		}
		
		System.out.println("\nAffichage des éléments du tableau dans l'ordre inverse :");
		for (int i=myTab.length-1; i>=0; i--) {
			System.out.println(myTab[i]);
		}
		
		int[] arrayCopy = new int[myTab.length];
		
		System.out.println("\nCopie dans un nouveau tableau :");
		for(int i=0; i<myTab.length; i++) {
			
			arrayCopy[i] = myTab[i];
			System.out.println(arrayCopy[i]);
		}
	}

}
