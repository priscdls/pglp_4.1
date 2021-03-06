package priscille.pglp_4_1;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;
/**
 * Tests unitaires de la classe CompositePersonnel.
 */
public class CompositePersonnelTest {
	/**
	 * Test du constructeur.
	 */
	@Test
	public void test() {
		CompositePersonnel c = new CompositePersonnel();
		Iterator<InterfacePersonnel> it = c.iterator();
		assertFalse(it.hasNext());
	}
	@Test
	/**
	 * Test de l'ajout d'un membre du personnel.
	 */
	public void testAjout() {
		CompositePersonnel c1 = new CompositePersonnel();
		Iterator<InterfacePersonnel> it = c1.iterator();
		Personnel p = new Personnel.Builder("Daoulas","Priscille",java.time.LocalDate.of(1996, 05, 23),null).build();
		c1.add(p);
		c1.print();
		assertTrue(it.hasNext());
	}
	@Test
	/**
	 * Test de la suppression d'un membre du personnel.
	 */
	public void testSuppression() {
		CompositePersonnel c1 = new CompositePersonnel();
		Iterator<InterfacePersonnel> it = c1.iterator();
		CompositePersonnel c2 = new CompositePersonnel();
		c1.add(c2);
		c1.remove(c2);
		assertFalse(it.hasNext());
}

}
