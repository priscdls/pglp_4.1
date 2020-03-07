package Priscille_DAOULAS.pglp_4_1;

import java.util.ArrayList;
/**
 * Classe Personnel représente un membre du personnel.
 * Cette classe implémente l'interface InterfacePersonnel.
 */
public final class Personnel implements InterfacePersonnel {
	/**
	 * Nom du membre du personnel.
	 */
	private final String nom;
	/**
	 * Prénom du membre du personnel.
	 */
	private final String prenom;
	/**
	 * Date de naissance du membre du personnel.
	 */
	private final java.time.LocalDate dateNaissance;
	/**
	 * Liste des numéro de téléphone du membre du personnel.
	 */
	private final ArrayList<Integer> numTel;
	/**
	 * Pattern Builder.
	 *
	 */
	public static class Builder {
		/**
		 * Nom du membre du personnel.
		 */
		private final String nom;
		/**
		 * Prénom du membre du personnel.
		 */
		private final String prenom;
		/**
		 * Date de naissance du membre du personnel.
		 */
		private final java.time.LocalDate dateNaissance;
		/**
		 * Liste des numéros de téléphone du membre du personnel.
		 */
		private final ArrayList<Integer> numTel;
		/**
		 * Constructeur.
		 * @param n Nom du membre du personnel.
		 * @param p Prénom du membre du personnel.
		 * @param date Date de naissance du membre du personnel.
		 * @param numListe des numéro de téléphone du membre du personnel.
		 */
		public Builder(final String n, final String p,
				final java.time.LocalDate date, final ArrayList<Integer> num) {
			this.nom = n;
			this.prenom = p;
			this.dateNaissance = date;
			this.numTel = num;
		}
		/**
		 * Fonction qui construit une variable
		 * de type Personnel a l'aide du Builder.
		 * @return La variable Personnel
		 */
		public Personnel build() {
			return new Personnel(this);
		}
	}
	/**
	 * Constructeur.
	 * @param builder Le builder de la classe Personnel
	 */
	public Personnel(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numTel = builder.numTel;
	}
	/**
	 * Fonction qui écrit les informations d'un membre du Personnel.
	 */
	public void print() {
		System.out.println("Nom : " + nom + ", Prenom : " + prenom
				+ ", Date de Naissance : " + dateNaissance 
				+ ", Numero(s) de telephone : " + numTel + "\n");
	}
}
