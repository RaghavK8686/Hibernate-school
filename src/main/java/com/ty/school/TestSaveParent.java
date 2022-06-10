package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Parent parent =new Parent ();
		
		parent.setName("Greeshu");
		parent.setPhone(8945875l);
		parent.setEmail("greeshu@gmail.com");
		
		entityTransaction.begin();
		entityManager.persist(parent);
		entityTransaction.commit();
		
	}

}
