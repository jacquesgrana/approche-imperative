package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int[] arrayCopy = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			int j = array.length -1 -i;
			
			arrayCopy[j] = array[i];
		}
		
		System.out.println("\nAffichage des éléments du tableau :");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\nAffichage des éléments du tableau copié dans l'ordre inverse :");
		for(int i=0; i<array.length; i++) {
			System.out.println(arrayCopy[i]);
		}

	}

}
