package com.gtm.compte.test;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.compte.Compte;

public class CompteTest {
	
	@Test
	public void testVerser() {
		//fail("Not yet implemented");
		
		Compte c = new Compte();
		float resultat = c.getSolde();
		c.verser(100); 
		c.verser(-50);
		c.verser(75);
		resultat = c.getSolde();
		Assert.assertEquals("ERREUR VERSER", 175, resultat, 0);
	}

	@Test
	public void testRetirer() {
		//fail("Not yet implemented");
		
		Compte c = new Compte();
		c.setSolde(175);
		float resultat = c.getSolde();
		c.retirer(100);
		c.retirer(-50);
		c.retirer(175);
		c.retirer(50);
		resultat = c.getSolde();
		Assert.assertEquals("ERREUR RETIRER", 25, resultat, 0);
	}

}
