package com.gtm.compte.test;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.compte.CompteSimple;

public class CompteSimpleTest {

	@Test
	public void testRetirer() {
		
		CompteSimple c = new CompteSimple(1000);
		c.setSolde(1700);
		float resultat = c.getSolde();
		c.retirer(1000);
		c.retirer(-500);
		c.retirer(1600);
		c.retirer(500);
		resultat = c.getSolde();
		Assert.assertEquals("ERREUR RETIRER", -900, resultat, 0);
	}

}
