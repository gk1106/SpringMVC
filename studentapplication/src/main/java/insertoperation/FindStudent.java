package insertoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudent {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
		EntityManager em = emf.createEntityManager();
		
		Student s = em.find(Student.class, 1);
		System.out.println(s);
	}

}
