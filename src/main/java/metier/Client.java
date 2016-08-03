package metier;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client extends Personne {

	ArrayList<Compte> comptes = new ArrayList<>();

	ArrayList<Credit> credits = new ArrayList<>();

	public Client(String nom, String prenom, String email, String tel) {
		super(nom, prenom, email, tel);
	}

	public ArrayList<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}

	public ArrayList<Credit> getCredits() {
		return credits;
	}

	public void setCredits(ArrayList<Credit> credits) {
		this.credits = credits;
	}
}
