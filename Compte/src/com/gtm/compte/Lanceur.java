package com.gtm.compte;

/**
 * 
 * @author malbranche
 *
 */
public class Lanceur {

	static public int NEXT_CODE = 0;
	
	public static void main(String[] args) {

		Compte compte = new Compte();		
		NEXT_CODE++;
		System.out.println("Compte no.: " + compte.getCode());
		compte.verser(-100);
		compte.verser(100);
		compte.retirer(200);
		compte.retirer(100);
		
		System.out.println("\n");
		System.out.println("Nombre de comptes: " + Compte.getNbComptes());

		System.out.println("\n");
		CompteSimple compteSimple = new CompteSimple(500);
		NEXT_CODE++;
		System.out.println("Compte simple no.: " + compteSimple.getCode());
		compteSimple.verser(-100);
		compteSimple.verser(100);
		compteSimple.retirer(600);
		compteSimple.retirer(500);
		
		System.out.println("\n");
		System.out.println("Nombre de comptes: " + Compte.getNbComptes());

		System.out.println("\n");
		CompteEpargne compteEpargne = new CompteEpargne((float) 5.);
		NEXT_CODE++;
		System.out.println("Compte épargne no.: " + compteEpargne.getCode());	
		compteEpargne.verser(600);
		compteEpargne.retirer(400);
		compteEpargne.calculInterets();

		System.out.println("\n");
		System.out.println("Nombre de comptes: " + Compte.getNbComptes());

		System.out.println("\n");
		ComptePayant comptePayant = new ComptePayant();
		NEXT_CODE++;
		System.out.println("Compte épargne no.: " + comptePayant.getCode());	
		comptePayant.verser(600);
		comptePayant.retirer(400);
		
		System.out.println("\n");
		System.out.println("Nombre de comptes: " + Compte.getNbComptes());
		
	}

}
