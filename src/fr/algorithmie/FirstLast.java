package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] myTab = {12, 15, 5, 7, 12};
		
		boolean isOk = (myTab.length >= 1) && (myTab[0] == myTab[myTab.length-1]);

		System.out.println("Test tab : " + isOk);

	}

}
