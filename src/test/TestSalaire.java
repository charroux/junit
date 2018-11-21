package test;

import org.junit.Test;

import paye.Salaire;

import org.junit.Assert;
import org.junit.Before;

public class TestSalaire {
	
	Salaire salaire;
	
	@Before
	public void init() {
		salaire = new Salaire();
	}
	
	@Test
	public void testNominal() {
		try {
			float montant = salaire.calculer(30, 50);
			Assert.assertTrue(montant == 1500);
		} catch (Exception e) {
			Assert.fail("Erreur calcule");	
		}
	}
	
	@Test
	public void testHeuresSup() {
		try {
			float montant = salaire.calculer(50, 30);
			Assert.assertTrue(montant == 1612.5);
		} catch (Exception e) {
			Assert.fail("Erreur calcule");	
		}	
	}
	
	@Test(expected = Exception.class)			
	public void testDepassementHeures() throws Exception {
		salaire.calculer(90, 30);
	}
	
	@Test(expected = Exception.class)			
	public void testDepassementTauxHoraire() throws Exception {
		salaire.calculer(50, 60);
	}
	
	@Test(expected = Exception.class)			
	public void testSaisieIncorrecte() throws Exception {
		salaire.calculer(-5, -5);
	}

	@Test(timeout = 100)
	public void testTempsCalcul() {
		for(int i=0; i<10000; i++) {
			try {
				float montant = salaire.calculer(50, 30);
				Assert.assertTrue(montant == 1612.5);
			} catch (Exception e) {
				Assert.fail("Erreur calcule");	
			}
		}
	}

}
