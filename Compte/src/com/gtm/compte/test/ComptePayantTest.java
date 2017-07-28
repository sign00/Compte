package com.gtm.compte.test;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.compte.ComptePayant;

public class ComptePayantTest {

	@Test
	public void testVerser() {
		
		ComptePayant c = new ComptePayant();
		float resultat = c.getSolde();
		c.verser(200); 
		resultat = c.getSolde();
		Assert.assertEquals("ERREUR VERSER", 198, resultat, 0);
	}

	@Test
	public void testRetirer() {

		ComptePayant c = new ComptePayant();
		c.setSolde(200);
		float resultat = c.getSolde();
		c.retirer(100);		
		resultat = c.getSolde();
		Assert.assertEquals("ERREUR RETIRER", 99, resultat, 0);
	}

}
