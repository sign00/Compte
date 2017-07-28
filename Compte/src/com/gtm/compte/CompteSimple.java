package com.gtm.compte;

/**
 * 
 * @author malbranche
 *
 */
public class CompteSimple extends Compte {

	private float decouvert;
	
	public CompteSimple(float dec) {

		super();
		
		if(dec > 0) 
			decouvert = dec;
		else
			decouvert = (float) 0.;
		
		System.out.println("Découvert autorisé: " + decouvert);
	}

	@Override
	public void retirer(float mt) {
		
		if(mt <= 0 || mt > solde+decouvert) {
			
			System.out.println("Montant erroné!" + 
					" Solde inchangé: " + solde);
			
			return;
		}
		
		float ancienSolde = solde;
		solde -= mt;
		System.out.println("Ancien solde: " + ancienSolde +
				" Nouveau solde: " + solde);		
		
	}

	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", solde=" + solde + "]";
	}


}
