package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateVisitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Visitor visitor= new Visitor();
		visitor.setId(1);
		visitor.setName("Jingle");
		visitor.setEmail("jingle@gmail.com");
		visitor.setDob(LocalDate.now());
		visitor.setVisitDateTime(LocalDateTime.now());
		
		entityTransaction.begin();
		entityManager.merge(visitor);
		entityTransaction.commit();

	}

}
