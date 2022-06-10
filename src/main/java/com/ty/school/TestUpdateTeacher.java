package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Radhe");
		teacher.setEmail("radhe@gmail.com");
		teacher.setPhone(159874512);
		teacher.setGender("female");

		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();

	}

}
