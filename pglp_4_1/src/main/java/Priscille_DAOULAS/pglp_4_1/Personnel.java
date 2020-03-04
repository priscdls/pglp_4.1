package Priscille_DAOULAS.pglp_4_1;

import java.util.ArrayList;

public final class Personnel {

	private final String nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final ArrayList<Integer> numTel;
	
	public static class Builder {
		private final String nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private final ArrayList<Integer> numTel;
		
		public Builder(String nom, String prenom, java.time.LocalDate dateNaissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.numTel = new ArrayList<Integer>();
		}
	}
	
	public Personnel(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numTel = builder.numTel;
	}
}
