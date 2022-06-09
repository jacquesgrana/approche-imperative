package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		float moy = 0.0f;
		float sum = 0.0f;
		
		for (int i=1; i<array.length; i++) {
			sum += array[i];
		}
		
		moy = sum / array.length;
		
		System.out.println("Valeur de la moyenne : " + moy);

	}

}
