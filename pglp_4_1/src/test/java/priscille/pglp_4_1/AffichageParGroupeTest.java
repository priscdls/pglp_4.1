package priscille.pglp_4_1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;
/**
 * Tests unitaires de la classe AffichageParGroupe.
 *
 */
public class AffichageParGroupeTest {
	/**
	 * Test
	 */
	@Test
	public void test() {
		CompositePersonnel c1 = new CompositePersonnel();
    	CompositePersonnel c2 = new CompositePersonnel();
    	CompositePersonnel c3 = new CompositePersonnel();
    	ArrayList<String> numTel = new ArrayList<String>();
    	numTel.add("0123456789");
    	numTel.add("0987654321");
		Personnel p1 = new Personnel.Builder("Daoulas", "Priscille",
				java.time.LocalDate.of(1996, 05, 23),
				numTel).build();
		Personnel p2 = new Personnel.Builder("Jean", "Jacques",
				java.time.LocalDate.of(2005, 04, 16),
				null).build();
		AfficheParGroupe apg = new AfficheParGroupe();
        c1.add(c2);
        c1.add(p1);
        c2.add(c3);
        c2.add(p2);
        apg.parcoursLargeur(c1);
        ArrayList<InterfacePersonnel> listParcoursExacte = new ArrayList<InterfacePersonnel>();
        listParcoursExacte.add(c1);
        listParcoursExacte.add(c2);
        listParcoursExacte.add(p1);
        listParcoursExacte.add(c3);
        listParcoursExacte.add(p2);
        Iterator<InterfacePersonnel> it = apg.iterator();
        ArrayList<InterfacePersonnel> listParcours = new ArrayList<InterfacePersonnel>();
        while (it.hasNext()) {
        	listParcours.add(it.next());
        }
        apg.print();
        assertTrue(listParcoursExacte.toString().equalsIgnoreCase(listParcours.toString()));
	}

}
