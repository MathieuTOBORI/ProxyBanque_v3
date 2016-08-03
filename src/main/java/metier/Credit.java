package metier;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CREDIT")
public class Credit {
	
	@Id
	private long idCredit;
	private String duree;
	private double montant;
	private double taux;

	public Credit() {
		super();
	}

	public long getIdCredit() {
		return idCredit;
	}

	public void setIdCredit(long idCredit) {
		this.idCredit = idCredit;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
}
