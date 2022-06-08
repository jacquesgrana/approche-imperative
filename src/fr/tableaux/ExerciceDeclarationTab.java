package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		int[] tabInt = {8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println("Valeur du tableau en 0 : " + tabInt[0] + "\n");
		
		System.out.println("Longueur du tableau : " + tabInt.length + "\n");
		
		System.out.println("Valeur en fin de tableau  : " + tabInt[tabInt.length-1]  + "\n");
		
		// on ne peut pas afficher l'élément d'index 10 car la longueur du tableau est 8 (indice entre 0 et 7) 
	}

}
