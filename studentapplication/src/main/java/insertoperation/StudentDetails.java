package insertoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s = new Student();
		s.setId(1);
		s.setName("prem");
		s.setEmail("prem123@gmail.com");
		s.setPerc(88);

		et.begin();
		em.persist(s);
		et.commit();
	}

}
