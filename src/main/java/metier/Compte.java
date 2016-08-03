package metier;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import enumeration.TypeCompte;
import exception.AutorisationDecouvertException;

@Entity
@Table(name = "COMPTE")
public class Compte {
	
	@Id
	private long numComp;
	private String dateOuverture;
	private double montant;
	TypeCompte typeCompte;

	public Compte(String dateDebut, double montant, TypeCompte typeCompte) {
		super();
		this.dateOuverture = dateDebut;
		this.montant = montant;
		this.typeCompte = typeCompte;
	}

	public Compte() {
		super();
		this.dateOuverture = "";
		this.montant = 0;
		this.typeCompte = TypeCompte.COURANT;
	}

	public long getNumComp() {
		return numComp;
	}

	public void setNumComp(long numComp) {
		this.numComp = numComp;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) throws AutorisationDecouvertException {
		if (typeCompte == TypeCompte.EPARGNE)
			if (montant < 0)
				throw new AutorisationDecouvertException(montant);
		if (typeCompte == TypeCompte.EPARGNE)
			if (montant < -1500)
				throw new AutorisationDecouvertException(montant);
		this.montant = montant;
	}

	public TypeCompte getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
}
