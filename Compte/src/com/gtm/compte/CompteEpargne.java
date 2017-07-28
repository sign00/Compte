package com.gtm.compte;

/**
 * 
 * @author malbranche
 *
 */
public class CompteEpargne extends Compte {
	
	private float taux;

	private float TAUX_MAX = 10;
	
	public CompteEpargne(float taux) {
		
		super();
		
		if(taux >= 0 && taux <= TAUX_MAX) 
			this.taux = taux;
		else
			this.taux = (float) 0.;
		
		System.out.println("Taux max: " + this.TAUX_MAX + " %");
		System.out.println("Taux appliqué: " + this.taux + " %");			
	}

	public void calculInterets() {
		
		float ancienSolde = solde;
		
		solde += solde * taux / 100;
		
		System.out.println("Ancien solde: " + ancienSolde +
				" Nouveau solde: " + solde);	
	}
	
	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", solde=" + solde + "]";
	}
	

}
