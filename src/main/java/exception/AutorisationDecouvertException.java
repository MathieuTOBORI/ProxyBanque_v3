package exception;

public class AutorisationDecouvertException extends Exception {

	private double montant;

	public AutorisationDecouvertException(double montant) {
		super("Decouvert de " + montant);
		this.montant = montant;
	}

	public double getMontant() {
		return montant;
	}
}
