package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentsById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 1);
		if (student != null) {
			System.out.println("id is :" + student.getId());
			System.out.println("name is :" + student.getName());
			System.out.println("Percentage is :" + student.getPercentage());
		} else {
			System.out.println("no student exist for given id");
		}
	}
}
