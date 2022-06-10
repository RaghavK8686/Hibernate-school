package com.ty.school;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetMultipleStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String sql = "select student from Student student ";

		Query query = entityManager.createQuery(sql);
		List<Student> student = query.getResultList();

		for (Student students : student) {
			System.out.println("Id is :" + students.getId());
			System.out.println("name is :" + students.getName());
			System.out.println("Percentage is :" + students.getPercentage());
			System.out.println("********************");
		}

	}

}
