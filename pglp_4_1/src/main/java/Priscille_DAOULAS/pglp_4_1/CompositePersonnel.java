package Priscille_DAOULAS.pglp_4_1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Pattern Composite CompositePersonnel
 * implémentant l'interface InterfacePersonnel.
 */
public class CompositePersonnel implements InterfacePersonnel {
	/**
	 * Liste de membres du personnels d'un même composite.
	 */
	private ArrayList<InterfacePersonnel> list =
			new ArrayList<InterfacePersonnel>();
	/**
	 * Identifiant d'un composite.
	 */
	private final int id;
	/**
	 * Identifiant du composite suivant.
	 */
	private static int idFin = 1;
	/**
	 * Constructeur.
	 */
	public CompositePersonnel() {
		id = idFin++;
		list = new ArrayList<InterfacePersonnel>();
	}
	/**
	 * Fonction d'écriture des informations du composite.
	 */
	public void print() {
		System.out.println("Id : " + id);
		for (InterfacePersonnel intP : list) {
			intP.print();
		}
	}
	/**
	 * Fonction qui ajoute une personne a la liste du personnel.
	 * @param intP La personne a ajouter
	 */
	public void add(final InterfacePersonnel intP) {
		list.add(intP);
	}
	/**
	 * Fonction qui enlève une personne a la liste du personnel.
	 * @param intP La personne a enlever
	 */
	public void remove(final InterfacePersonnel intP) {
		list.remove(intP);
	}
	/**
	 * Fonction qui crée un Itérateur
	 * de la liste des personnes du Composite.
	 * @return L'iterateur
	 */
	public Iterator<InterfacePersonnel> iterateur() {
		return list.iterator();
	}
	/**
	 * Getter de l'identifiant du Composite.
	 * @return L'identifiant
	 */
	public final int getId() {
		return id;
	}
	/**
	 * Fonction qui fait un parcours en largeur.
	 * @param ip InterfacePersonnel à afficher
	 */
	public static void parcoursLargeur(final InterfacePersonnel ip) {
		ArrayDeque<InterfacePersonnel> file1 =
				new ArrayDeque<InterfacePersonnel>();
		ArrayDeque<InterfacePersonnel> file2 =
				new ArrayDeque<InterfacePersonnel>();
		InterfacePersonnel i;
		file2.add(ip);
		while (!file2.isEmpty()) {
			i = file2.pollFirst();
			file1.add(i);
			if (i.getClass() == CompositePersonnel.class) {
				CompositePersonnel cp = (CompositePersonnel) i;
				Iterator<InterfacePersonnel> it =
						cp.iterateur();
				while (it.hasNext()) {
					i = it.next();
					if (!file2.contains(i)
							&& !file1.contains(i)) {
						file2.add(i);
					}
				}
			}
		}
		for (InterfacePersonnel ip2 : file1) {
			if (ip2.getClass() == CompositePersonnel.class) {
				CompositePersonnel cp2 =
						(CompositePersonnel) ip2;
				System.out.println("Id : " + cp2.getId());
			} else {
				ip2.print();
			}
		}
	}
}
