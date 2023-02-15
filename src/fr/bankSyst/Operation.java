package fr.bankSyst;

public interface Operation {
	
	/**virement qui prend l'id des deux comptes + le solde du debiteur
	 * @param x ID compte débiteur
	 * @param y ID compte créditeur
	 * @param z  solde du débiteur
	 * @return solde du débiteur après débit
	 */
	static double virement(String idCompte , String idCompteD, double montant) {
		
		return montant;
	}
	/** retrait de y sur le compte x
	 * @param x ID du compte
	 * @param y- solde avec débit
	 * @return solde après débit
	 */
	static double retrait(String idCompte, double solde, double montant) {
		
		return solde-montant;
	}
	/**
	 * @param x ID du compte
	 * @param y solde avant ajout 
	 * @return solde nouveau
	 */
	static double versement(String idCompte, double solde, double montant) {
		
		return solde+montant;
	}
	/**
	 * @param solde du compte
	 * @return un string de mise en forme 
	 */
	static String soldeAffichage(double solde) {
		return "Solde de votre compte : "+ solde;
	}
}
