package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] myTab = {12, 15, 5, 7, 6};
		
		boolean isOk = (myTab.length >= 1) && ((myTab[0] == 6) || (myTab[myTab.length-1] == 6));

		System.out.println("Test tab : " + isOk);
	}

}
