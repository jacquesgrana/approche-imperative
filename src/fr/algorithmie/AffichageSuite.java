package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {

		System.out.println("\nNombres de 1 à 10 inclus :");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\nNombres pairs entre 0 et 10 inclus :");
		for(int i=0; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("\nNombres impairs entre 0 et 9 inclus :");
		for(int i=0; i<=9; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("\nNombres de 1 à 10 inclus (avec while) :");
		int count = 1;
		while(count <= 10) {
			System.out.println(count);
			count++;
		}
		
		System.out.println("\nNombres pairs entre 0 et 10 inclus (avec while) :");
		count = 0;
		while(count <= 10) {
			if (count%2 == 0 ) {
				System.out.println(count);
			}
			count++;
		}
		
		System.out.println("\nNombres impairs entre 0 et 9 inclus (avec while) :");
		count = 0;
		while(count <= 9) {
			if (count%2 != 0 ) {
				System.out.println(count);
			}
			count++;
		}
		
	}

}
