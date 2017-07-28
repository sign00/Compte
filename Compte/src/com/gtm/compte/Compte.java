package com.gtm.compte;

/**
 * @author malbranche
 *
 */
public class Compte {
	
	private int code;
	protected float solde;
	static private int nbComptes;
	
	public Compte() {
		
		solde = 0;		
		code = Lanceur.NEXT_CODE;
		nbComptes = code;
		
	}	
	
	public static int getNbComptes() {
		return nbComptes;
	}

	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}

	public int getCode() {		
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
	
	public void verser(float mt) {
		
		if(mt <= 0) {
			
			System.out.println("Montant erroné!" + 
					" Solde inchangé: " + solde);
			
			return;
		}
		
		float ancienSolde = solde;
		solde += mt;
		System.out.println("Ancien solde: " + ancienSolde +
				" Nouveau solde: " + solde);
		
	}
	
	public void retirer(float mt) {
		
		if(mt <= 0 || mt > solde) {
			
			System.out.println("Montant erroné!" + 
					" Solde inchangé: " + solde);
			
			return;
		}
		
		float ancienSolde = solde;
		solde -= mt;
		System.out.println("Ancien solde: " + ancienSolde +
				" Nouveau solde: " + solde);		
		
	}
}
