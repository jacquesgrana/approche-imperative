package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		
		System.out.println("Entiers de 1 à 10 :");
		for (int i=1; i<= 10; i++) {
			
			System.out.println(i);
		}
		System.out.println();
		System.out.println("20 fois mon nom :");
		for (int i=0; i< 20; i++) {
			
			System.out.println("Jacques Granarolo");
		}
		
		System.out.println();
		System.out.println("entiers pairs de 2 à 100 :");
		for (int i=2; i<= 100; i++) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}
		
		System.out.println();
		System.out.println("entiers impairs de 1 à 99 :");
		for (int i=1; i<= 99; i++) {
			
			if(i%2 != 0) {
				System.out.println(i);
			}
			
		}
		
	}

}
