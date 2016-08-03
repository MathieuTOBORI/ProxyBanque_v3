package metier;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CONSEILLER")
public class Conseiller extends Personne {

	private String password;

	ArrayList<Client> clients = new ArrayList<>();

	public Conseiller(String nom, String prenom, String email, String tel, String password) {
		super(nom, prenom, email, tel);
		this.password = password;
	}

	public Conseiller() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
}
