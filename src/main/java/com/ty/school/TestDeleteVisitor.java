package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVisitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Visitor visitor = entityManager.find(Visitor.class, 1);
		if (visitor != null) {
			entityTransaction.begin();
			entityManager.remove(visitor);
			entityTransaction.commit();
		} else {
			System.out.println("Visitor not found");
		}
	}
	}
