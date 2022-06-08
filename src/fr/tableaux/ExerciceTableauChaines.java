package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] tabString = {"Paris", "Marseille", "Lyon", "Montpellier", "Nantes"};
		
		for (int i=0; i<tabString.length; i++) {
			System.out.println("Elément n° " + (i+1) + " : " + tabString[i]);
		}
		
		System.out.println("\nLongueur du tableau : " + tabString.length);
		
		tabString[3] = "Reims";
		
		System.out.println();
		
		for (int i=0; i<tabString.length; i++) {
			System.out.println("Elément n° " + (i+1) + " : " + tabString[i]);
		}
	}

}
