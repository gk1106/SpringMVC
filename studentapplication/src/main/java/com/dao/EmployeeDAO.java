package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Employee;

public class EmployeeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Employee saveEmployee(Employee emp) {
		et.begin();
		em.persist(emp);
		et.commit();
		return emp;
	}

	public Employee deleteEmployee(int id) {
		Employee e = findEmployee(id);
		if (e != null) {
			et.begin();
			em.remove(e);
			et.commit();
			return e;
		} else {
			System.out.println("Employee isn't Present with given Id..");
			return null;
		}
	}

	public Employee findEmployee(int id) {
		return em.find(Employee.class, id);
	}

	public Employee updateEmployee(Employee e, int id) {
		Employee exEmp = findEmployee(id);
		e.setId(id);
		if (exEmp != null) {

			if (e.getName() == null) {
				e.setName(exEmp.getName());
			}
			if (e.getEmail() == null) {
				e.setEmail(exEmp.getEmail());
			}
			if (e.getPhno() <= 0) {
				e.setPhno(exEmp.getPhno());
			}
			if (e.getSal() <= 0.0) {
				e.setSal(exEmp.getSal());
			}

			et.begin();
			em.merge(e);
			et.commit();

			return e;
		} else {
			System.out.println("Employee isn't Present with given Id..");
			return null;
		}
	}

	public Employee remove(int id) {
		Employee e = findEmployee(id);
		if (e != null) {
			et.begin();
			em.remove(e);
			et.commit();
			return e;
		} else {
			System.out.println("Employee isn't Present with given Id..");
			return null;
		}
	}

}
