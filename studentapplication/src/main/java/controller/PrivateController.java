package controller;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class PrivateController {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String username;
	String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		PrivateController pc = new PrivateController();
		pc.setUsername("fz_kid_3862");
		pc.setPassword("Premkowc@21");

		PrivateController pc1 = new PrivateController();
		pc1.setUsername("lovely._.music._.offl");
		pc1.setPassword("Premkowc@21");

		PrivateController pc2 = new PrivateController();
		pc2.setUsername("_full.screen.status");
		pc2.setPassword("Premkowc@21");

		PrivateController pc3 = new PrivateController();
		pc3.setUsername("premmass014@gmail.com");
		pc3.setPassword("Premkowc@21");

		PrivateController pc4 = new PrivateController();
		pc4.setUsername("premkumar191999@gmail.com");
		pc4.setPassword("Premkowc@21");

		PrivateController pc5 = new PrivateController();
		pc5.setUsername("101580699240");
		pc5.setPassword("Premkowc@19");

		et.begin();
		em.persist(pc);
		em.persist(pc1);
		em.persist(pc2);
		em.persist(pc3);
		em.persist(pc4);
		em.persist(pc5);
		et.commit();

	}

}
