package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Visitor visitor=entityManager.find(Visitor.class, 2);
		if(visitor!=null)
		{
			System.out.println("visitor is :"+visitor.getId());
			System.out.println("Visitor name :"+visitor.getName());
			System.out.println("visitor email :"+visitor.getEmail());
			System.out.println("visitor dob:"+visitor.getDob());
			System.out.println("visitor date and time :"+visitor.getVisitDateTime());
			System.out.println("visitor gender is "+visitor.getGender());
		}
		else
		{
			System.out.println("visitor not found");
		}
	}

}
