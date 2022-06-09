package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		int[] myTab = {0, 1, 2, 3};
		int[] tempTab = new int[myTab.length];
		
		System.out.println("\nAvant rotation :");
		for (int i=0; i<myTab.length; i++) {
			System.out.println(myTab[i]);
		}
		
		for (int i=0; i<myTab.length; i++) {
			if (i < myTab.length-1) {
				tempTab[i+1] = myTab[i];
			}
			else {
				tempTab[0] = myTab[i];
			}
		}
		
		for (int i=0; i<myTab.length; i++) {
			myTab[i] = tempTab[i];
		}
		
		System.out.println("\nAprès rotation :");
		for (int i=0; i<myTab.length; i++) {
			System.out.println(myTab[i]);
		}
	}
}
