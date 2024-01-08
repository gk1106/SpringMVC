package insertoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {

	public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
      EntityManager em = emf.createEntityManager();
      EntityTransaction et = em.getTransaction();
      
      Student us = em.find(Student.class,1);
      us.setEmail("prem9988@gmail.com");
      us.setPerc(70);
      
      et.begin();
      em.merge(us);
      et.commit();
	}

}
