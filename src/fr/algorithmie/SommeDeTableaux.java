package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		

		int[] array01 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array02 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		int[] arraySum = new int[array01.length];
		
		for(int i=0; i<array01.length; i++) {
			arraySum[i] = array01[i] + array02[i];
			System.out.println(arraySum[i] + " = " + array01[i] + " + " + array02[i]);
		}
	}

}
