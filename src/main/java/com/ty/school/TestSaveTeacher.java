package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Teacher teacher=new Teacher();
		teacher.setId(3);
		teacher.setName("Divya");
		teacher.setEmail("divya@gmail.com");
		teacher.setPhone(88645313l);
		teacher.setGender("female");
		
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		System.out.println("Added Teacher");
		
	}

}
