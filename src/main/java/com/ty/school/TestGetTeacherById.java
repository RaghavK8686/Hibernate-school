package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeacherById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 1);
		if (teacher != null) {
			System.out.println("Teacher id is :" + teacher.getId());
			System.out.println("Teacher name is :" + teacher.getName());
			System.out.println("Teacher email is :" + teacher.getEmail());
			System.out.println("Teacher phoneno  is " + teacher.getPhone());
			System.out.println("Teacher gender is :" + teacher.getGender());
		} else {
			System.out.println("Visitor not found");
		}

	}
}
