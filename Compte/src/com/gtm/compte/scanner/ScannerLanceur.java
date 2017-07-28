package com.gtm.compte.scanner;

import java.util.Scanner;

import com.gtm.compte.Compte;

public class ScannerLanceur {

	public static void main(String[] args) {
		 
		System.out.print("Donner le numéro de compte: ");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		System.out.print("Donner le solde du compte: ");
		float solde = keyboard.nextFloat();
		Compte compte = new Compte();
		compte.setCode(numero);
		compte.setSolde(solde);
		System.out.println(compte);
		keyboard.close(); 
	}

}
