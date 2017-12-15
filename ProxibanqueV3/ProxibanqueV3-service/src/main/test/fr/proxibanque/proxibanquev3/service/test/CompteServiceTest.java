package fr.proxibanque.proxibanquev3.service.test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.core.Is.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import fr.proxibanque.proxibanquev3.dao.CompteDao;
import fr.proxibanque.proxibanquev3.domaine.Client;
import fr.proxibanque.proxibanquev3.domaine.ClientParticulier;
import fr.proxibanque.proxibanquev3.domaine.Compte;
import fr.proxibanque.proxibanquev3.domaine.CompteCourant;
import fr.proxibanque.proxibanquev3.domaine.CompteEpargne;

/**
 * @author benjamin et hattmann
 *	tests de la classe CompteService
 */
public class CompteServiceTest {

	@Test
	public void TestgetAllComptesEpargnes() {

		List<CompteEpargne> listeCeDao = new ArrayList<CompteEpargne>();
		CompteEpargne ce1 = new CompteEpargne();
		CompteEpargne ce2 = new CompteEpargne();
		CompteEpargne ce3 = new CompteEpargne();
		listeCeDao.add(ce1);
		listeCeDao.add(ce2);
		listeCeDao.add(ce3);

		CompteDao cd = new CompteDao();
		List<CompteEpargne> listReal = listeCeDao;
		assertThat(listReal.size(), is(3));
	}

	@Test
	public void TestgetAllComptesCourants() {

		List<CompteCourant> listeCCDao = new ArrayList<CompteCourant>();
		CompteCourant cc1 = new CompteCourant();
		CompteCourant cc2 = new CompteCourant();
		CompteCourant cc3 = new CompteCourant();
		listeCCDao.add(cc1);
		listeCCDao.add(cc2);
		listeCCDao.add(cc3);

		CompteDao cd = new CompteDao();
		List<CompteCourant> listReal = listeCCDao;
		assertThat(listReal.size(), is(3));

	}

	@Test
	public void testGetComptesbyClient(Client cli) {
		fail();
	}

	@Test
	public void testSelectCompteByNumCompte() {
		fail();
	}

	@Test
	public void testGeneNumCompte() {
		fail();
	}

}
