package fr.bankSyst;

public interface Operation {
	
	/**virement qui prend l'id des deux comptes + le solde du debiteur
	 * @param x ID compte débiteur
	 * @param y ID compte créditeur
	 * @param z  solde du débiteur
	 * @return solde du débiteur après débit
	 */
	static double virement(String x , String y, double z) {
		
		return z;
	}
	/** retrait de y sur le compte x
	 * @param x ID du compte
	 * @param y- solde avec débit
	 * @return solde après débit
	 */
	static double retrait(String x, double y, double montant) {
		return y-montant;
	}
	/**
	 * @param x ID du compte
	 * @param y solde avant ajout 
	 * @return solde nouveau
	 */
	static double versement(String x, double y, double montant) {
		return y+montant;
	}
	/**
	 * @param y solde du compte
	 * @return un string de mise en forme 
	 */
	static String soldeAffichage(double y) {
		return "Solde de votre compte : "+ y;
	}
}
