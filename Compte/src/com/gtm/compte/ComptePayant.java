package com.gtm.compte;

/**
 * 
 * @author malbranche
 *
 */
public class ComptePayant extends Compte {

	public ComptePayant() {
		super();
		
	}

	@Override
	public void verser(float mt) {
		
		if(mt <= 0) {
			
			System.out.println("Montant erroné!" + 
					" Solde inchangé: " + solde);
			
			return;
		}
		
		float montant = mt - mt * 1 / 100;
		
		super.verser(montant);
	}

	@Override
	public void retirer(float mt) {

	if(mt <= 0 || mt > solde) {
			
			System.out.println("Montant erroné!" + 
					" Solde inchangé: " + solde);
			
			return;
		}
	
		float montant = mt + mt * 1 / 100;
	
		super.retirer(montant);
	}

	@Override
	public String toString() {
		return "ComptePayant [solde=" + solde + "]";
	}
	
}
