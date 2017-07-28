package com.gtm.compte.test;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.compte.CompteEpargne;

public class CompteEpargneTest {

	@Test
	public void testCalculInterets() {

		CompteEpargne c = new CompteEpargne(5);
		c.setSolde(2000);
		float resultat = c.getSolde();
		c.calculInterets();
		resultat = c.getSolde();
		Assert.assertEquals("ERREUR EPARGNE", 2100, resultat, 0);
	}

}
